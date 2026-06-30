package kj5;

/* loaded from: classes.dex */
public final class f extends cj5.d1 {

    /* renamed from: p, reason: collision with root package name */
    public int f308460p;

    /* renamed from: q, reason: collision with root package name */
    public int f308461q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f308462r;

    /* renamed from: s, reason: collision with root package name */
    public long f308463s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f308463s = -1L;
    }

    @Override // cj5.d1
    public void U6(boolean z17) {
        super.U6(z17);
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new kj5.d(this, null), 1, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 1000001001) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent.getIntExtra("select_record_msg_num", 0);
        this.f308460p = intExtra;
        this.f308461q = intExtra;
        this.f308462r = intent.getStringArrayListExtra("key_selected_record_msg_list");
        if (this.f308460p == 0) {
            d75.b.g(new kj5.e(this));
            return;
        }
        this.f308463s = intent.getLongExtra("select_record_min_msg_id", -1L);
        rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
        int i19 = this.f308460p;
        ((qg5.p0) v0Var).getClass();
        int g17 = com.tencent.mm.ui.chatting.x3.g();
        if (1 <= g17 && g17 < i19) {
            z17 = true;
        }
        if (z17) {
            this.f308461q = com.tencent.mm.ui.chatting.x3.g();
        }
        d75.b.g(new kj5.e(this));
    }

    @Override // cj5.d1, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        super.onCreate(bundle);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new kj5.b(this));
    }

    @Override // cj5.d1, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        super.onDestroy();
        if (((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
            com.tencent.mm.ui.chatting.x3.a();
        }
    }
}
