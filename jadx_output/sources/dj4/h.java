package dj4;

/* loaded from: classes10.dex */
public final class h implements dj4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj4.h f232976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f232979g;

    public h(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, mj4.h hVar, java.lang.String str2, java.lang.String str3, int i17) {
        this.f232973a = context;
        this.f232974b = imageView;
        this.f232975c = str;
        this.f232976d = hVar;
        this.f232977e = str2;
        this.f232978f = str3;
        this.f232979g = i17;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusImgHandler", "begin download ori pic");
        dj4.u uVar = dj4.u.f233049a;
        android.content.Context context = this.f232973a;
        android.widget.ImageView imageView = this.f232974b;
        java.lang.String str = this.f232975c;
        mj4.h hVar = this.f232976d;
        java.lang.String str2 = this.f232977e;
        java.lang.String str3 = this.f232978f;
        kotlin.jvm.internal.o.d(str3);
        uVar.b(context, imageView, str, hVar, str2, str3, null, this.f232979g, false);
    }
}
