package com.tencent.mm.plugin.forcenotify.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BaseForceNotifyShowUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f137327d = "MicroMsg.ForceNotifyShowUI";

    /* renamed from: e, reason: collision with root package name */
    public i13.c f137328e;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(0, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477848d6);
        getWindow().addFlags(6815744);
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        setBackBtn(new k13.a(this));
        i13.l lVar = i13.n.f287297c;
        if (true ^ lVar.a().f287299a.isEmpty()) {
            this.f137328e = (i13.c) lVar.a().f287299a.poll();
        } else {
            com.tencent.mars.xlog.Log.e(this.f137327d, "forceNotify dataList is empty");
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        i13.c cVar = this.f137328e;
        if (cVar != null) {
            i13.n a17 = i13.n.f287297c.a();
            a17.getClass();
            java.lang.String forcePushId = cVar.f287275d;
            kotlin.jvm.internal.o.g(forcePushId, "forcePushId");
            a17.f287300b.remove(forcePushId);
        }
        boolean z17 = !i13.n.f287297c.a().f287299a.isEmpty();
        java.lang.String str = this.f137327d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "continue to showNotifyActivity");
            ((h13.l0) i95.n0.c(h13.l0.class)).hj(true);
        }
        com.tencent.mars.xlog.Log.i(str, "[onDestroy]");
    }
}
