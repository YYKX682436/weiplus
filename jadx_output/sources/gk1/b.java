package gk1;

/* loaded from: classes4.dex */
public final class b extends dm.x {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f272459v = dm.x.initAutoDBInfo(gk1.b.class);

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.mm.ipcinvoker.extension.a f272460w = new gk1.a();

    @Override // dm.x, l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues convertTo = super.convertTo();
        if (convertTo.containsKey("isDarkMode")) {
            convertTo.put("isDarkMode", java.lang.Integer.valueOf(this.field_isDarkMode ? 1 : 0));
        }
        return convertTo;
    }

    @Override // dm.x, l75.f0
    public l75.e0 getDBInfo() {
        return f272459v;
    }
}
