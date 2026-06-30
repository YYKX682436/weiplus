package com.tencent.mm.plugin.magicbrush.demo.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/ui/MagicBrushDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View;", "view", "Ljz5/f0;", "onClick", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MagicBrushDemoActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public wc3.b f147919d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f147920e;

    public final void T6(wc3.b bVar) {
        wc3.b bVar2 = this.f147919d;
        if (bVar2 != null) {
            android.view.ViewGroup viewGroup = bVar2.f444508f;
            if (viewGroup == null) {
                kotlin.jvm.internal.o.o("containerView");
                throw null;
            }
            viewGroup.removeAllViews();
            jc3.j0 j0Var = bVar2.f444507e;
            if (j0Var == null) {
                kotlin.jvm.internal.o.o("magicBrush");
                throw null;
            }
            ((rc3.w0) j0Var).destroy();
        }
        this.f147919d = bVar;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvg;
    }

    public final void onClick(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.b5x) {
            T6(new wc3.b());
            wc3.b bVar = this.f147919d;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("magicBrushDemoLogic");
                throw null;
            }
            android.widget.FrameLayout frameLayout = this.f147920e;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("containerView");
                throw null;
            }
            bVar.f444508f = frameLayout;
            wc3.b bVar2 = this.f147919d;
            if (bVar2 != null) {
                bVar2.C0(this);
                return;
            } else {
                kotlin.jvm.internal.o.o("magicBrushDemoLogic");
                throw null;
            }
        }
        if (id6 == com.tencent.mm.R.id.lcu) {
            T6(new wc3.d());
            wc3.b bVar3 = this.f147919d;
            if (bVar3 == null) {
                kotlin.jvm.internal.o.o("magicBrushDemoLogic");
                throw null;
            }
            android.widget.FrameLayout frameLayout2 = this.f147920e;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("containerView");
                throw null;
            }
            bVar3.f444508f = frameLayout2;
            if (this.f147919d == null) {
                kotlin.jvm.internal.o.o("magicBrushDemoLogic");
                throw null;
            }
            com.tencent.mars.xlog.Log.i("MagicBrushDemoPublicService", "MagicBrushDemoPublicService start");
            wc3.b bVar4 = this.f147919d;
            if (bVar4 != null) {
                bVar4.C0(this);
            } else {
                kotlin.jvm.internal.o.o("magicBrushDemoLogic");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicBrush2.0 Demo");
        setBackBtn(new zc3.d(this));
        ((android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.ctq)).setBackgroundColor(-1);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484047cu0);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f147920e = (android.widget.FrameLayout) findViewById;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        wc3.b bVar = this.f147919d;
        if (bVar != null) {
            bVar.destroy();
        } else {
            kotlin.jvm.internal.o.o("magicBrushDemoLogic");
            throw null;
        }
    }
}
