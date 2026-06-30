package com.tencent.mm.plugin.textstatus.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusProfileCardFeedActivity;", "Lcom/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class TextStatusProfileCardFeedActivity extends com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f173684t = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f173685s = "MicroMsg.TextStatusProfileCardFeedActivity@" + hashCode();

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity
    public java.util.ArrayList V6(java.util.Collection preDataItemList, java.lang.String str) {
        kotlin.jvm.internal.o.g(preDataItemList, "preDataItemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = str == null || str.length() == 0;
        java.lang.String str2 = this.f173685s;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str2, "buildDataList empty");
            return arrayList;
        }
        arrayList.add(new jj4.b(kz5.n0.V0(ai4.m0.f5173a.G().q(str))));
        com.tencent.mars.xlog.Log.i(str2, "buildDataList count:" + arrayList.size());
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity
    public android.graphics.drawable.Drawable X6() {
        return new android.graphics.drawable.ColorDrawable(i65.a.d(getContext(), com.tencent.mm.R.color.aay));
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity
    public boolean a7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i(this.f173685s, "finish: ");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.String str = this.f173685s;
        if (i17 == 1) {
            if (i18 == -1) {
                com.tencent.mars.xlog.Log.i(str, "onActivityResult: LikeHalfUI back");
                ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173788v = false;
                return;
            }
            return;
        }
        if (i17 == 2 && i18 == -1) {
            com.tencent.mars.xlog.Log.i(str, "onActivityResult: CommentHalfUI back");
            ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) component(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173788v = false;
        }
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i(this.f173685s, "onCreate: ");
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f173685s, "onDestroy: ");
        super.onDestroy();
        android.os.Handler handler = ym5.a1.f463189a;
        java.util.Iterator it = ym5.a1.f463190b.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((ym5.b1) ((java.util.Map.Entry) it.next()).getValue()).f463210a.getContext(), this)) {
                it.remove();
                com.tencent.mars.xlog.Log.e("ExposeElves", "activity(" + this + ") leak");
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f173685s, "onPause: ");
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f173685s, "onResume: ");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i(this.f173685s, "onStop: ");
    }
}
