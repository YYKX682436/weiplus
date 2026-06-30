package od2;

/* loaded from: classes12.dex */
public class e extends o13.a {
    @Override // o13.a
    public boolean C() {
        return !i(org.chromium.net.NetError.ERR_CACHE_MISS, 6);
    }

    @Override // o13.a
    public void E() {
        if (C()) {
            L(-400L, 6L);
        }
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5FinderFollowerStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 1792;
    }

    @Override // o13.u
    public int getType() {
        return 1792;
    }

    @Override // o13.a
    public java.lang.String t() {
        return "FinderFollow";
    }
}
