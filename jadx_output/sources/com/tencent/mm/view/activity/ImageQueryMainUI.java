package com.tencent.mm.view.activity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/view/activity/ImageQueryMainUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class ImageQueryMainUI extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.by;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(zm5.r0.class);
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478512u));
        hideTitleView();
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478512u));
    }
}
