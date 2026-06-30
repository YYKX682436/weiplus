package com.tencent.mm.plugin.profile.ui.newbizinfo.auth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "rr3/d0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NewBizInfoRecordingUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154194d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mvvmlist.MvvmList f154195e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a1t;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.an6);
        hideActionbarLine();
        setBackBtn(new rr3.e0(this));
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154194d = stringExtra;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.aor);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.aoq);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.awy);
        java.lang.String str = this.f154194d;
        if (str == null) {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
        rr3.c cVar = new rr3.c(str);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455357b = true;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(cVar, n0Var, this, null, null, 24, null);
        this.f154195e = mvvmList;
        recyclerView.setAdapter(new xm3.t0(mvvmList, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.newbizinfo.auth.NewBizInfoRecordingUI$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return type == 1 ? new rr3.e() : new rr3.g0();
            }
        }, false));
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = this.f154195e;
        if (mvvmList2 != null) {
            mvvmList2.f152071u.observe(this, new rr3.f0(this, recyclerView, textView, progressBar));
        } else {
            kotlin.jvm.internal.o.o("liveList");
            throw null;
        }
    }
}
