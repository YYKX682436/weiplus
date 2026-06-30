package kl3;

/* loaded from: classes10.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nl3.b f308850h;

    public v(kl3.z zVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, nl3.b bVar) {
        this.f308846d = str;
        this.f308847e = str2;
        this.f308848f = str3;
        this.f308849g = str4;
        this.f308850h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ql3.b Ai = ll3.o2.Ai();
        java.lang.String str = this.f308846d;
        java.lang.String str2 = this.f308847e;
        java.lang.String str3 = this.f308848f;
        java.lang.String str4 = this.f308849g;
        nl3.b bVar = this.f308850h;
        Ai.P0(str, str2, str3, str4, bVar.f338185h, bVar.f338186i);
    }
}
