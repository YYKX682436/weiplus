package hz1;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: q, reason: collision with root package name */
    public static int f286285q;

    /* renamed from: r, reason: collision with root package name */
    public static java.util.List f286286r;

    /* renamed from: a, reason: collision with root package name */
    public final int f286287a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f286288b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f286289c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f286290d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f286291e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f286292f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f286293g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f286294h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f286295i;

    /* renamed from: k, reason: collision with root package name */
    public int f286297k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f286298l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f286299m;

    /* renamed from: p, reason: collision with root package name */
    public final int f286302p;

    /* renamed from: j, reason: collision with root package name */
    public int f286296j = -1;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f286300n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f286301o = "";

    public a(java.lang.String str) {
        androidx.fragment.app.FragmentActivity activity;
        if (str != null && !(str instanceof hz1.a)) {
            int hashCode = str.hashCode();
            this.f286287a = hashCode;
            java.lang.String simpleName = str.getClass().getSimpleName();
            this.f286289c = simpleName;
            this.f286288b = simpleName + "_" + hashCode;
            this.f286290d = str.getClass().getCanonicalName();
            boolean c17 = c(str.getClass().getSimpleName());
            this.f286293g = c17;
            boolean c18 = u46.l.c(str.getClass().getCanonicalName(), "com.tencent.mm.ui.chatting.ChattingUIFragment");
            this.f286294h = c18;
            boolean z17 = str instanceof androidx.fragment.app.Fragment;
            this.f286292f = (!z17 || c18 || c17) ? false : true;
            this.f286291e = str instanceof androidx.fragment.app.FragmentActivity;
            this.f286295i = u46.l.c(simpleName, "MMFlutterViewActivity");
            if (str instanceof android.app.Activity) {
                this.f286297k = ((android.app.Activity) str).getTaskId();
            } else if (z17 && (activity = ((androidx.fragment.app.Fragment) str).getActivity()) != null) {
                this.f286297k = activity.getTaskId();
                this.f286302p = activity.hashCode();
            }
            if (this.f286297k <= 0) {
                this.f286297k = f286285q;
                return;
            }
            return;
        }
        if (sz1.a.j()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Create SubstitutePage use illegal argument, page is ");
            sb6.append(str == null ? "null" : str);
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Create SubstitutePage use illegal argument, page is ");
        sb7.append(str == null ? "null" : str);
        com.tencent.mars.xlog.Log.e("Amoeba.SubstitutePage", sb7.toString());
    }

    public java.lang.String a() {
        return this.f286299m ? "mutil_task" : !u46.l.e(this.f286300n) ? this.f286300n : "";
    }

    public java.lang.String b() {
        return this.f286299m ? "mutil_task" : !u46.l.e(this.f286301o) ? this.f286301o : "";
    }

    public final boolean c(java.lang.String str) {
        if (u46.l.e(str)) {
            return false;
        }
        if (f286286r == null) {
            f286286r = new java.util.ArrayList(4);
            java.lang.String Zi = h62.d.vj().Zi(e42.d0.clicfg_data_report_4tab_page_config, "MainUI|MvvmAddressUIFragment|FindMoreFriendsUI|MoreTabUI", true);
            if (!u46.l.e(Zi)) {
                for (java.lang.String str2 : Zi.split("\\|")) {
                    if (!((java.util.ArrayList) f286286r).contains(str2)) {
                        ((java.util.ArrayList) f286286r).add(str2);
                    }
                }
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) f286286r).iterator();
        while (it.hasNext()) {
            if (u46.l.c(str, (java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean d(hz1.a aVar) {
        return aVar != null && u46.l.c(aVar.f286289c, this.f286289c) && u46.l.c(aVar.f286290d, this.f286290d) && aVar.f286287a == this.f286287a;
    }

    public java.lang.String toString() {
        return "SubstitutePage{pageHash=" + this.f286287a + ", simplePageName='" + this.f286289c + "', canonicalPageName='" + this.f286290d + "', stackDeep='" + this.f286296j + "', isSubPage=" + this.f286292f + "', isParentPage=" + this.f286291e + "', isFlutterPage=" + this.f286295i + "', isSubPage=" + this.f286292f + "', is4TabOfLauncherUI=" + this.f286293g + "', title=null', taskId=" + this.f286297k + "', isBackground=" + this.f286298l + "', isMutilTask=" + this.f286299m + "', origEnterMethod=" + this.f286301o + "', currEnterMethod=" + this.f286300n + "', isChattingUIFragment=" + this.f286294h + '}';
    }

    public a(int i17, java.lang.String str, java.lang.String str2) {
        this.f286287a = i17;
        this.f286289c = str;
        this.f286288b = str + "_" + i17;
        this.f286290d = str2;
        boolean c17 = c(str);
        this.f286293g = c17;
        boolean c18 = u46.l.c(str2, "com.tencent.mm.ui.chatting.ChattingUIFragment");
        this.f286294h = c18;
        this.f286292f = (!u46.l.c(str2, "androidx.fragment.app.Fragment") || c18 || c17) ? false : true;
        this.f286291e = u46.l.c(str2, "androidx.fragment.app.FragmentActivity");
        this.f286295i = u46.l.c(str, "MMFlutterViewActivity");
    }
}
