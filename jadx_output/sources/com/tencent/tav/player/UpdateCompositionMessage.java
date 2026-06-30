package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class UpdateCompositionMessage {
    public final com.tencent.tav.player.PlayerItem playerItem;
    public final com.tencent.tav.player.OnCompositionUpdateListener updateListener;

    public UpdateCompositionMessage(com.tencent.tav.player.PlayerItem playerItem, com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener) {
        this.playerItem = playerItem;
        this.updateListener = onCompositionUpdateListener;
    }
}
