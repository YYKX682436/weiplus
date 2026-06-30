package com.tencent.mm.ui.chatting.search.multi;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/search/multi/FTSChattingConvMultiTabUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
@ul5.d(0)
/* loaded from: classes9.dex */
public final class FTSChattingConvMultiTabUI extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcn;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{ee5.a3.class, ee5.q3.class, ee5.e3.class, ee5.h0.class, ee5.v0.class, ee5.n1.class, ee5.m2.class, ee5.n0.class, ee5.v1.class, ee5.z.class, ee5.j.class, ee5.d1.class, ee5.h2.class, ee5.a2.class, ee5.i1.class, ee5.s1.class});
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSChattingConvMultiTabUI", "onCreate");
        showMMLogo();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
    }
}
