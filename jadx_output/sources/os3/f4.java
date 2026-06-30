package os3;

/* loaded from: classes.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f348081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348082e;

    public f4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI, android.content.Intent intent) {
        this.f348082e = readMailUI;
        this.f348081d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f348081d;
        intent.putExtra("curPageId", 2);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348082e;
        java.lang.String string = readMailUI.getString(com.tencent.mm.R.string.azq);
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.v(readMailUI, intent, string, null, null);
    }
}
