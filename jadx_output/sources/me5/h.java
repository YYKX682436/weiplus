package me5;

/* loaded from: classes4.dex */
public class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f325962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ me5.j f325963e;

    public h(me5.j jVar, android.content.Context context) {
        this.f325963e = jVar;
        this.f325962d = context;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f325962d;
        g4Var.f(100, context.getResources().getString(com.tencent.mm.R.string.i4p));
        g4Var.f(101, com.tencent.mm.sdk.platformtools.t8.z1(context.getResources().getString(com.tencent.mm.R.string.ayg), this.f325963e.f325969g));
    }
}
