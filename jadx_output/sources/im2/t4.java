package im2;

/* loaded from: classes3.dex */
public final class t4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f292547e;

    /* renamed from: f, reason: collision with root package name */
    public long f292548f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f292549g;

    /* renamed from: h, reason: collision with root package name */
    public int f292550h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f292551i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292546d = "FinderLiveExitAnimateOp@" + hashCode() + '}';
    }

    public final void O6(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f292546d, "notifyFinish source: " + str + " start finish");
        this.f292547e = true;
        getActivity().finish();
        ig2.a aVar = ig2.a.f291362a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList fluentExitLiveRoomPlayerList: ");
        java.util.HashMap hashMap = ig2.a.f291364c;
        sb6.append(hashMap.size());
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap2 = ig2.a.f291363b;
        sb6.append(hashMap2.size());
        com.tencent.mars.xlog.Log.i("FinderFluentReplaySwitchManager", sb6.toString());
        hashMap2.clear();
        hashMap.clear();
    }

    public final void P6() {
        getActivity().getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        getActivity().getWindow().getDecorView().setBackgroundColor(0);
        ig2.r b17 = ig2.a.f291362a.b(this.f292548f);
        if (b17 == null || !(b17 instanceof ig2.f)) {
            O6("director = null");
            return;
        }
        if (b17.c() == null) {
            O6("onDirectorExit object = null");
            return;
        }
        ig2.n c17 = b17.c();
        kotlin.jvm.internal.o.d(c17);
        ez2.a aVar = c17.f291402a;
        long j17 = this.f292548f;
        android.view.ViewGroup viewGroup = this.f292549g;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("parentView");
            throw null;
        }
        og2.a aVar2 = new og2.a(aVar, j17, viewGroup, null);
        b17.d(aVar2);
        com.tencent.mars.xlog.Log.i(this.f292546d, "onDirectorExit params = " + aVar2);
        b17.b(new im2.s4(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        this.f292551i = true;
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("CURRENT_FEED_ID", 0L);
        this.f292548f = longExtra;
        ig2.r b17 = ig2.a.f291362a.b(longExtra);
        this.f292550h = b17 != null ? b17.hashCode() : 0;
        com.tencent.mars.xlog.Log.i(this.f292546d, "onCreate currentFeedId: " + this.f292548f + " directorHashCode: " + this.f292550h);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.gd9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f292549g = (android.view.ViewGroup) findViewById;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.String str = this.f292546d;
        com.tencent.mars.xlog.Log.i(str, "onDestroy");
        ig2.a aVar = ig2.a.f291362a;
        ig2.r b17 = aVar.b(this.f292548f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("directorHashCode: ");
        sb6.append(this.f292550h);
        sb6.append(" direct: ");
        sb6.append(b17 != null ? b17.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if ((b17 != null ? b17.hashCode() : 0) == this.f292550h) {
            aVar.a(this.f292548f);
        }
    }
}
