package com.tencent.mm.plugin.textstatus.ui;

@db5.a(512)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusHistoryActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusHistoryActivity extends com.tencent.mm.ui.vas.VASActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c8h;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("KEY_TITLE", i65.a.r(getContext(), com.tencent.mm.R.string.ome));
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f21093a;
        androidx.fragment.app.Fragment instantiate = androidx.fragment.app.Fragment.instantiate(getContext(), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_text_state_history_v2_and, bm5.h0.RepairerConfig_TextStatus_NewTextStatusHistory_Int, 1) == 1 ? com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI.class.getName() : com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI.class.getName(), new android.os.Bundle());
        kotlin.jvm.internal.o.e(instantiate, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
        com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) instantiate;
        mMFragment.setArguments(bundle2);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.qcu, mMFragment, null, 1);
        beginTransaction.d();
    }
}
