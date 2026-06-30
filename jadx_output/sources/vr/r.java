package vr;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.u f439425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f439426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f439427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439429h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vr.u uVar, boolean z17, byte[] bArr, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f439425d = uVar;
        this.f439426e = z17;
        this.f439427f = bArr;
        this.f439428g = str;
        this.f439429h = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f439425d.f439438a;
        if (lVar != null) {
            jz5.l lVar2 = new jz5.l("fromSearch", java.lang.Boolean.valueOf(this.f439426e));
            byte[] emojiBytes = this.f439427f;
            kotlin.jvm.internal.o.f(emojiBytes, "$emojiBytes");
            lVar.invoke(kz5.c1.k(lVar2, new jz5.l("emoji", emojiBytes), new jz5.l("thumbPath", this.f439428g), new jz5.l("coverPath", this.f439429h)));
        }
        return jz5.f0.f302826a;
    }
}
