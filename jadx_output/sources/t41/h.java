package t41;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f415495a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f415496b;

    public void a(int i17) {
        int i18 = (~i17) & this.f415495a;
        this.f415495a = i18;
        if (i18 == 0) {
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcUpdateChatroomEnable(), this.f415496b);
            this.f415496b = 0;
        }
    }
}
