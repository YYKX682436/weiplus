package k75;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public k75.k f304815a;

    /* renamed from: b, reason: collision with root package name */
    public long f304816b = java.lang.System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public int f304817c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304818d;

    /* renamed from: e, reason: collision with root package name */
    public k75.a f304819e;

    /* renamed from: f, reason: collision with root package name */
    public k75.a f304820f;

    /* renamed from: g, reason: collision with root package name */
    public k75.a f304821g;

    public e(k75.k kVar, android.os.Message message, java.lang.String str, k75.a aVar, k75.a aVar2, k75.a aVar3) {
        this.f304815a = kVar;
        this.f304817c = message != null ? message.what : 0;
        this.f304818d = str;
        this.f304819e = aVar;
        this.f304820f = aVar2;
        this.f304821g = aVar3;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time=");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(this.f304816b);
        sb6.append(java.lang.String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
        sb6.append(" processed=");
        k75.a aVar = this.f304819e;
        sb6.append(aVar == null ? "<null>" : aVar.getName());
        sb6.append(" org=");
        k75.a aVar2 = this.f304820f;
        sb6.append(aVar2 == null ? "<null>" : aVar2.getName());
        sb6.append(" dest=");
        k75.a aVar3 = this.f304821g;
        sb6.append(aVar3 != null ? aVar3.getName() : "<null>");
        sb6.append(" what=");
        k75.k kVar = this.f304815a;
        if (kVar != null) {
            kVar.getClass();
            str = null;
        } else {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            sb6.append(this.f304817c);
            sb6.append("(0x");
            sb6.append(java.lang.Integer.toHexString(this.f304817c));
            sb6.append(")");
        } else {
            sb6.append(str);
        }
        if (!android.text.TextUtils.isEmpty(this.f304818d)) {
            sb6.append(" ");
            sb6.append(this.f304818d);
        }
        return sb6.toString();
    }
}
