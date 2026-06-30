package com.tencent.mm.plugin.magicbrush.demo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class MagicBaseDemoActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f147916f = 0;

    /* renamed from: d, reason: collision with root package name */
    public zc3.c f147917d;

    /* renamed from: e, reason: collision with root package name */
    public zq0.a f147918e;

    public abstract zc3.c T6();

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489253ej5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicSimpleBizDemo");
        setBackBtn(new zc3.b(this));
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) kz5.c1.l(new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.usn), "preload"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.ngb), "start"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.v5g), "show"), new jz5.l(java.lang.Integer.valueOf(com.tencent.mm.R.id.nja), "stop"))).entrySet()) {
            ((android.widget.Button) findViewById(((java.lang.Number) entry.getKey()).intValue())).setOnClickListener(new zc3.a(this, (java.lang.String) entry.getValue()));
        }
    }
}
