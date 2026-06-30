package dh4;

/* loaded from: classes8.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p21.a f232577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232580g;

    public s(dh4.t tVar, p21.a aVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f232577d = aVar;
        this.f232578e = str;
        this.f232579f = str2;
        this.f232580g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f232577d.Z1(this.f232578e, this.f232579f, this.f232580g);
    }
}
