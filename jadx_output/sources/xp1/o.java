package xp1;

/* loaded from: classes12.dex */
public class o implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l34.b f455911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f455913c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455914d;

    public o(l34.b bVar, android.content.Context context, boolean z17, int i17, java.lang.String str) {
        this.f455911a = bVar;
        this.f455912b = context;
        this.f455913c = z17;
        this.f455914d = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f455911a.c(this.f455912b);
        if (this.f455913c) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15783, 1, 0, this.f455914d);
        }
    }
}
