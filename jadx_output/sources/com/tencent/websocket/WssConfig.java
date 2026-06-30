package com.tencent.websocket;

/* loaded from: classes7.dex */
public class WssConfig {
    int bz_type;
    int handshake_timeout;
    boolean per_message_deflate;
    int pong_timeout;
    boolean skip_domain_check;
    boolean tcp_no_delay;

    public WssConfig(int i17, int i18, boolean z17, boolean z18, int i19, boolean z19) {
        this.pong_timeout = i17;
        this.handshake_timeout = i18;
        this.tcp_no_delay = z17;
        this.skip_domain_check = z18;
        this.bz_type = i19;
        this.per_message_deflate = z19;
    }
}
