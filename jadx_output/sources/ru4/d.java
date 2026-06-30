package ru4;

/* loaded from: classes12.dex */
public final class d extends o13.a {
    @Override // o13.a
    public boolean C() {
        return !i(org.chromium.net.NetError.ERR_PROXY_AUTH_UNSUPPORTED, 2);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            L(-115L, 2L);
        }
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "AIHistoryFTS5Storage";
    }

    @Override // o13.u
    public int getPriority() {
        return 2304;
    }

    @Override // o13.u
    public int getType() {
        return 2304;
    }

    @Override // o13.a
    public java.lang.String p() {
        return "FTS.AIHistoryFTS5Storage";
    }

    @Override // o13.a
    public java.lang.String t() {
        return "AIHistory";
    }
}
