package l44;

/* loaded from: classes.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316186e;

    public j(android.content.Context context, java.lang.String str) {
        this.f316185d = context;
        this.f316186e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f316185d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        } else {
            db5.t7.h(context, this.f316186e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.helper.AdClipboardHelper$1");
        }
    }
}
