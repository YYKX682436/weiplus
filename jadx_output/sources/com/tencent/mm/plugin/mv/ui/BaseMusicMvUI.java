package com.tencent.mm.plugin.mv.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BaseMusicMvUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150858d = "MicroMsg.Mv.BaseMusicMvUI";

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.o1.c(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongControlUIC.class));
        }
        return null;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.bt4 bt4Var;
        super.onCreate(bundle);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.bt4.class, 7, true));
        r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 7, r45.bt4.class);
        java.lang.String str = this.f150858d;
        if (bt4Var2 != null && (bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 7, r45.bt4.class)) != null) {
            bt4Var2.f371036d = bt4Var.f371036d;
            bt4Var2.f371037e = bt4Var.f371037e;
            bt4Var2.f371038f = bt4Var.f371038f;
            bt4Var2.f371039g = bt4Var.f371039g;
            bt4Var2.f371041i = bt4Var.f371041i;
            com.tencent.mars.xlog.Log.i(str, "init mv page scene:" + bt4Var.f371036d + " contextId:" + bt4Var.f371037e + " finderCommentScene:" + bt4Var.f371038f + " finderContextId:" + bt4Var.f371041i);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_mv_report_data");
        if (byteArrayExtra != null) {
            try {
                r45.bt4 bt4Var3 = new r45.bt4();
                bt4Var3.parseFrom(byteArrayExtra);
                r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 7, r45.bt4.class);
                if (bt4Var4 != null) {
                    bt4Var4.f371036d = bt4Var3.f371036d;
                    bt4Var4.f371037e = bt4Var3.f371037e;
                    bt4Var4.f371038f = bt4Var3.f371038f;
                    bt4Var4.f371039g = bt4Var4.f371039g;
                    com.tencent.mars.xlog.Log.i(str, "init mv page report data from intent, " + bt4Var3.f371036d + ' ' + bt4Var3.f371037e + ' ' + bt4Var3.f371038f);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, e17.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
