package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class i3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f208897g = 0;

    /* renamed from: a, reason: collision with root package name */
    public long f208898a;

    /* renamed from: b, reason: collision with root package name */
    public long f208899b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f208900c;

    /* renamed from: d, reason: collision with root package name */
    public final int f208901d;

    /* renamed from: e, reason: collision with root package name */
    public final int f208902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.j3 f208903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.ui.j3 j3Var, android.os.Looper looper) {
        super(looper);
        this.f208903f = j3Var;
        this.f208901d = hashCode() | 1910;
        this.f208902e = hashCode() | 1914;
        j3Var.f208993c = new java.util.ArrayList(32);
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        int i18 = this.f208902e;
        com.tencent.mm.ui.j3 j3Var = this.f208903f;
        int i19 = this.f208901d;
        if (i17 != i18) {
            if (i17 == i19) {
                com.tencent.mm.ui.j3.a(j3Var);
                return;
            }
            return;
        }
        removeMessages(i19);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f208900c = true;
        java.lang.Object obj = message.obj;
        if (obj instanceof java.lang.Boolean) {
            this.f208900c = ((java.lang.Boolean) obj).booleanValue();
        }
        long j17 = this.f208899b;
        long j18 = currentTimeMillis - j17;
        int i27 = j3Var.f208995e.f209023m;
        if (j18 <= i27 && currentTimeMillis - j17 >= 0) {
            long j19 = this.f208898a;
            if ((j19 == 0 || currentTimeMillis - j19 <= r14.f209024n) && currentTimeMillis - j19 >= 0 && this.f208900c) {
                sendEmptyMessageDelayed(i19, i27);
                this.f208899b = currentTimeMillis;
            }
        }
        com.tencent.mm.ui.j3.a(j3Var);
        this.f208899b = currentTimeMillis;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(com.tencent.mm.ui.j3 j3Var, java.lang.String str) {
        super(str);
        this.f208903f = j3Var;
        this.f208901d = hashCode() | 1910;
        this.f208902e = hashCode() | 1914;
        j3Var.f208993c = new java.util.ArrayList(32);
    }
}
