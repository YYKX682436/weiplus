package zl2;

/* loaded from: classes2.dex */
public final class c2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473695b;

    public c2(android.content.Context context, yz5.a aVar) {
        this.f473694a = context;
        this.f473695b = aVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "[CgiFinderFeedBack] errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            android.content.Context context = this.f473694a;
            db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.f491805ea5), com.tencent.mm.R.raw.icons_filled_done);
            pm0.v.X(new zl2.b2(this.f473695b));
        }
        return jz5.f0.f302826a;
    }
}
