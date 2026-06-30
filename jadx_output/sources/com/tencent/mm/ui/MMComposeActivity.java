package com.tencent.mm.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/MMComposeActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class MMComposeActivity extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        if (androidx.lifecycle.n1.a(decorView) == null) {
            decorView.setTag(com.tencent.mm.R.id.p28, this);
        }
        if (androidx.lifecycle.o1.a(decorView) == null) {
            decorView.setTag(com.tencent.mm.R.id.p2_, this);
        }
        if (o4.j.a(decorView) == null) {
            o4.j.b(decorView, this);
        }
        super.onCreate(bundle);
    }
}
