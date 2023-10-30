package com.apress.prospring5.ch03;

public interface ArtworkSender {
    void sendArtwork(String artworkPath, Recipient recipient);

    String getFriendlyName();

    String getShortName();
}
