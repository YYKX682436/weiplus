package y35;

/* loaded from: classes4.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.SnsPreference f459206e;

    public d0(com.tencent.mm.pluginsdk.ui.preference.SnsPreference snsPreference, java.lang.String str) {
        this.f459206e = snsPreference;
        this.f459205d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent recentlySnsMediaObjEvent = new com.tencent.mm.autogen.events.RecentlySnsMediaObjEvent();
        recentlySnsMediaObjEvent.f54657g.f8473a = this.f459205d;
        recentlySnsMediaObjEvent.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        am.zp zpVar = recentlySnsMediaObjEvent.f54658h;
        r45.jj4 jj4Var = zpVar.f8595a;
        if (jj4Var != null) {
            linkedList.add(jj4Var);
        }
        r45.jj4 jj4Var2 = zpVar.f8596b;
        if (jj4Var2 != null) {
            linkedList.add(jj4Var2);
        }
        r45.jj4 jj4Var3 = zpVar.f8597c;
        if (jj4Var3 != null) {
            linkedList.add(jj4Var3);
        }
        r45.jj4 jj4Var4 = zpVar.f8598d;
        if (jj4Var4 != null) {
            linkedList.add(jj4Var4);
        }
        this.f459206e.Y.runOnUiThread(new y35.c0(this, linkedList));
    }
}
