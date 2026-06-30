package oc2;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f344234f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.String str, java.lang.String str2, java.lang.Throwable th6, java.lang.String str3) {
        super(0);
        this.f344232d = str;
        this.f344233e = str2;
        this.f344234f = th6;
        this.f344235g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f344232d + '-' + this.f344233e + '-' + this.f344234f.getMessage() + "-\n" + this.f344235g;
    }
}
