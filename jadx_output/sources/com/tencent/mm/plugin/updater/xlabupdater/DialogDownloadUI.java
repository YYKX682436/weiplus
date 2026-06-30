package com.tencent.mm.plugin.updater.xlabupdater;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class DialogDownloadUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f175508g = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f175509d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f175510e = jz5.h.b(new xn4.a(this));

    /* renamed from: f, reason: collision with root package name */
    public final xn4.b f175511f = new xn4.b(this);

    public final boolean U6(java.lang.String str) {
        return com.tencent.mm.vfs.w6.j(str) && com.tencent.mm.vfs.w6.k(str) > 0;
    }

    public final r45.mm6 V6() {
        return (r45.mm6) ((jz5.n) this.f175510e).getValue();
    }

    public abstract void W6(java.lang.String str);

    public abstract void X6(double d17);

    public abstract void Y6(r45.mm6 mm6Var);

    public abstract void Z6();

    public abstract void a7(java.lang.String str, r45.mm6 mm6Var);

    public final void b7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", "startDownload!");
        xn4.c0 c0Var = xn4.c0.f455604a;
        java.lang.String cdnUrl = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        java.lang.String cdnUrl2 = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
        java.lang.String g17 = c0Var.g(cdnUrl2);
        java.lang.String cdnUrl3 = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl3, "cdnUrl");
        java.lang.String f17 = c0Var.f(cdnUrl3);
        java.lang.String patchMd5 = V6().f380678q;
        kotlin.jvm.internal.o.f(patchMd5, "patchMd5");
        xn4.b callback = this.f175511f;
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", "startDownloadCore() called with: cdnurl = " + cdnUrl + ", mediaId = " + g17 + ", fullPath = " + f17 + ", md5 = " + patchMd5);
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_ApkPatchDownload";
        mVar.f241811z = cdnUrl;
        mVar.field_mediaId = g17;
        mVar.field_fullpath = f17;
        mVar.field_filemd5 = patchMd5;
        mVar.field_fileType = 30003;
        mVar.A = 20;
        mVar.B = 3600;
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(xn4.c0.f455611h));
        java.util.Map map = xn4.c0.f455605b;
        c0Var.b(g17, map);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(g17);
        if (obj == null) {
            obj = new java.util.LinkedHashSet();
            linkedHashMap.put(g17, obj);
        }
        ((java.util.Set) obj).add(new java.lang.ref.WeakReference(callback));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addCallback ");
        sb6.append(g17);
        sb6.append(' ');
        sb6.append(callback.hashCode());
        sb6.append(' ');
        java.util.Set set = (java.util.Set) linkedHashMap.get(g17);
        sb6.append(set != null ? java.lang.Integer.valueOf(set.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateHelper", sb6.toString());
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS");
        java.lang.String cdnUrl4 = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl4, "cdnUrl");
        this.f175509d = M.getInt(c0Var.g(cdnUrl4), 0);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(-1, -1);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.DialogDownloadUI", V6().toJSON().toString());
        if (android.text.TextUtils.isEmpty(V6().f380677p)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.XUpdate.DialogDownloadUI", "cdnUrl empty, finish!");
            finish();
            return;
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        db5.f.c(this, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new xn4.c(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        xn4.c0 c0Var = xn4.c0.f455604a;
        r45.mm6 info = V6();
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MMKV_NAME_XUPDATE_DIALOGINFO");
        java.lang.String cdnUrl = info.f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        M.putString(c0Var.g(cdnUrl), info.toJSON().toString());
    }
}
