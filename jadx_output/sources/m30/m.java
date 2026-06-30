package m30;

@j95.b
/* loaded from: classes2.dex */
public class m extends i95.w implements n30.r, n30.q {
    public java.lang.String Ai() {
        return b52.b.b();
    }

    public void Bi(java.lang.String str) {
        try {
            if (gm0.j1.a() && !android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.HellhoundUtil", "setFinderContextId USERINFO_FINDER_CONTEXT_ID_STRING:" + str);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CONTEXT_ID_STRING, str);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void Di(java.lang.String str) {
        try {
            if (gm0.j1.a() && !android.text.TextUtils.isEmpty(str)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ALL_CLICK_TAB_CONTEXT_ID_STRING, str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.HellhoundUtil", e17, "setFinderCurTabContextId crash: %s", e17.getMessage());
        }
    }

    public java.lang.String wi() {
        return a52.a.f1584l;
    }
}
