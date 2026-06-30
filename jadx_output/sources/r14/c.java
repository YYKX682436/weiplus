package r14;

/* loaded from: classes8.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r14.y f368608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368609c;

    public c(java.lang.String str, r14.y yVar, java.lang.String str2) {
        this.f368607a = str;
        this.f368608b = yVar;
        this.f368609c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String toUsers;
        if (!z17 || (toUsers = this.f368607a) == null) {
            return;
        }
        r14.y yVar = this.f368608b;
        com.tencent.mm.ui.MMActivity activity = yVar.f368633a;
        if (str == null) {
            str = "";
        }
        yVar.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(toUsers, "toUsers");
        java.lang.String path = this.f368609c;
        kotlin.jvm.internal.o.g(path, "path");
        g45.b.f268846a.a(toUsers, str, 0);
        ((dk5.s5) tg3.t1.a()).Vi(activity, toUsers, path, 0, "", "", null);
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
    }
}
