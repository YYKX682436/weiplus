package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class SendImgProxyUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f198315g;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f198316e = null;

    /* renamed from: f, reason: collision with root package name */
    public final pe5.f f198317f = new pe5.f(this);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        com.tencent.mm.ui.bk.k0(getWindow());
        com.tencent.mars.xlog.Log.i("MicroMsg.SendImgProxyUI", "onCreate isRunning:%b ,%d", java.lang.Boolean.valueOf(f198315g), java.lang.Integer.valueOf(hashCode()));
        if (f198315g) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendImgProxyUI", "duplicate instance");
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 3020L;
            errorMsgInfoStruct.k();
            finish();
            return;
        }
        f198315g = true;
        setContentView(com.tencent.mm.R.layout.f488168j3);
        this.f198316e = db5.e1.Q(this, "", getString(com.tencent.mm.R.string.gqx), true, false, null);
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.SendImgProxyUI$$a
            /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0166 A[SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1215
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.SendImgProxyUI$$a.run():void");
            }
        });
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendImgProxyUI", "onDestroy isRunning:%b , %d", java.lang.Boolean.valueOf(f198315g), java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendImgProxyUI", "onResume isRunning:%b ,%d", java.lang.Boolean.valueOf(f198315g), java.lang.Integer.valueOf(hashCode()));
        super.onResume();
    }
}
