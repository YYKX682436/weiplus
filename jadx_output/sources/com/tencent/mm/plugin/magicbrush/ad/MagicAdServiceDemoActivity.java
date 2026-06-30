package com.tencent.mm.plugin.magicbrush.ad;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ic3/a", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class MagicAdServiceDemoActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f147849o = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f147852f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f147853g;

    /* renamed from: m, reason: collision with root package name */
    public long f147856m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f147850d = "MagicAdServiceDemoActivity";

    /* renamed from: e, reason: collision with root package name */
    public wj.t0 f147851e = ic3.c0.f290393a[0];

    /* renamed from: h, reason: collision with root package name */
    public final int f147854h = 1000;

    /* renamed from: i, reason: collision with root package name */
    public final c06.e f147855i = new c06.g(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f147857n = kz5.c0.i(new ic3.a(com.tencent.mm.R.id.t9b, new ic3.o(this)), new ic3.a(com.tencent.mm.R.id.bys, new ic3.p(this)), new ic3.a(com.tencent.mm.R.id.f485049ty5, new ic3.q(this)), new ic3.a(com.tencent.mm.R.id.usn, new ic3.r(this)), new ic3.a(com.tencent.mm.R.id.f485048ty4, new ic3.s(this)), new ic3.a(com.tencent.mm.R.id.f484360ta2, new ic3.t(this)), new ic3.a(com.tencent.mm.R.id.t9c, new ic3.v(this)), new ic3.a(com.tencent.mm.R.id.f483608sp5, new ic3.w(this)), new ic3.a(com.tencent.mm.R.id.vda, new ic3.y(this)), new ic3.a(com.tencent.mm.R.id.vd_, new ic3.c(this)), new ic3.a(com.tencent.mm.R.id.t5x, new ic3.d(this)), new ic3.a(com.tencent.mm.R.id.sxk, new ic3.g(this)), new ic3.a(com.tencent.mm.R.id.sxi, new ic3.i(this)), new ic3.a(com.tencent.mm.R.id.sxl, new ic3.l(this)), new ic3.a(com.tencent.mm.R.id.sxj, new ic3.n(this)));

    public static final void T6(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        android.view.View view = magicAdServiceDemoActivity.f147853g;
        if (view != null) {
            ((android.widget.FrameLayout) magicAdServiceDemoActivity.findViewById(com.tencent.mm.R.id.cg7)).removeView(view);
            magicAdServiceDemoActivity.f147853g = null;
        }
    }

    public static final void U6(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity, java.lang.String str) {
        android.widget.Toast.makeText(magicAdServiceDemoActivity.getContext(), str, magicAdServiceDemoActivity.f147854h).show();
    }

    public final void V6() {
        java.lang.String str;
        if (this.f147856m == 0) {
            str = "无超时";
        } else {
            str = this.f147856m + "ms";
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483608sp5);
        if (button == null) {
            return;
        }
        button.setText("Timeout: " + str);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489252ej4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicAdService Demo");
        for (ic3.a aVar : this.f147857n) {
            android.widget.Button button = (android.widget.Button) findViewById(aVar.f290386a);
            if (button != null) {
                button.setOnClickListener(aVar.f290387b);
            }
        }
        V6();
        android.widget.Spinner spinner = (android.widget.Spinner) findViewById(com.tencent.mm.R.id.uqx);
        if (spinner != null) {
            spinner.setAdapter((android.widget.SpinnerAdapter) new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_list_item_multiple_choice, ic3.c0.f290393a));
            spinner.setSelection(0);
            spinner.setOnItemSelectedListener(new ic3.z(this));
        }
    }
}
