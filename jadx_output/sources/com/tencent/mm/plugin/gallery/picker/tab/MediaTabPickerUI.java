package com.tencent.mm.plugin.gallery.picker.tab;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.uc.CTRL_INDEX)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/tab/MediaTabPickerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes8.dex */
public final class MediaTabPickerUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        jz5.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "finish");
        java.lang.Object obj = null;
        if (vk5.a.f437774d) {
            oVar = new jz5.o(java.lang.Integer.valueOf(vk5.a.f437771a), vk5.a.f437772b, java.lang.Integer.valueOf(vk5.a.f437773c));
            vk5.a.f437771a = 0;
            vk5.a.f437772b = null;
            vk5.a.f437773c = -1;
            vk5.a.f437774d = false;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            b33.o oVar2 = (b33.o) pf5.z.f353948a.a(this).a(b33.o.class);
            java.util.Iterator it = oVar2.f17677f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.o.b(((jz5.l) next).f302834e, oVar2.f17678g)) {
                    obj = next;
                    break;
                }
            }
            jz5.l lVar = (jz5.l) obj;
            int intValue = lVar != null ? ((java.lang.Number) lVar.f302833d).intValue() : -1;
            int intValue2 = ((java.lang.Number) oVar.f302841d).intValue();
            android.content.Intent intent = (android.content.Intent) oVar.f302842e;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "get result back, currentPageType=" + intValue + ", resultCode:" + intValue2 + ", " + intent + ", requestCode=" + ((java.lang.Number) oVar.f302843f).intValue());
            if (intValue != -1) {
                if (intent != null) {
                    intent.putExtra("key_page_type", intValue);
                }
                setResult(intValue2, intent);
            }
        }
        super.finish();
        if (getIntent().hasExtra("KEY_PARAMS_EXIT_ANIM")) {
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, getIntent().getIntExtra("KEY_PARAMS_EXIT_ANIM", -1));
        } else {
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxd;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{b33.f.class, b33.o.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "onBackPressed");
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intExtra;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        com.tencent.mm.ui.v9.d(this);
        getWindow().setStatusBarColor(0);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        }
        hideTitleView();
        getWindow().getDecorView().setSystemUiVisibility(0);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        if (!com.tencent.mm.ui.b4.c(this) && (intExtra = getIntent().getIntExtra("intent_bottom_navigationbar_height", 0)) > 0) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484999g71);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = intExtra;
            findViewById.setLayoutParams(layoutParams);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "onCreate");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaTabPickerUI", "onResume");
    }
}
