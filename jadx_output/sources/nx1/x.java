package nx1;

/* loaded from: classes12.dex */
public class x implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f341325f = java.util.regex.Pattern.compile("\\r\\n|\\r|\\n");

    /* renamed from: d, reason: collision with root package name */
    public final int f341326d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f341327e = new java.util.ArrayList();

    public x(android.text.Spanned spanned) {
        this.f341326d = 0;
        if (spanned != null) {
            java.lang.String obj = spanned.toString();
            this.f341326d = 1;
            java.util.regex.Matcher matcher = f341325f.matcher(obj);
            int i17 = 0;
            while (matcher.find()) {
                this.f341327e.add(new px1.l(i17, matcher.end(), this.f341326d == 1, false));
                i17 = matcher.end();
                this.f341326d++;
            }
            if (this.f341327e.size() < this.f341326d) {
                this.f341327e.add(new px1.l(i17, obj.length(), this.f341326d == 1, true));
            }
        }
    }

    public int a(int i17) {
        java.util.ArrayList arrayList;
        int i18 = 0;
        while (true) {
            int i19 = this.f341326d;
            arrayList = this.f341327e;
            if (i18 >= i19 || i17 < ((px1.l) arrayList.get(i18)).f341316e) {
                break;
            }
            i18++;
        }
        return java.lang.Math.min(java.lang.Math.max(0, i18), arrayList.size() - 1);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f341327e.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            px1.l lVar = (px1.l) it.next();
            int i18 = i17 + 1;
            sb6.append(i17);
            sb6.append(": ");
            sb6.append(lVar.f341315d);
            sb6.append("-");
            sb6.append(lVar.f341316e);
            sb6.append(lVar.f358831g ? "" : ", ");
            i17 = i18;
        }
        return sb6.toString();
    }
}
