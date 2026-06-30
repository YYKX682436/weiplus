package he5;

/* loaded from: classes9.dex */
public class n implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280956a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280957b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280958c;

    /* renamed from: d, reason: collision with root package name */
    public long f280959d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.component.s7 f280960e;

    public n(java.lang.String str, int i17, int i18, hd5.n nVar, com.tencent.mm.ui.chatting.component.s7 s7Var) {
        this.f280956a = str;
        this.f280957b = i17;
        this.f280958c = i18;
        this.f280960e = s7Var;
    }

    @Override // he5.t
    public int a() {
        return this.f280958c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    @Override // he5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List r24, he5.s r25) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: he5.n.b(java.util.List, he5.s):void");
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        this.f280959d = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(this.f280956a);
        oVar.next();
    }

    @Override // he5.t
    public void close() {
    }

    @Override // he5.t
    public long d() {
        return this.f280959d;
    }
}
