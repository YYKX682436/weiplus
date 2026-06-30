package xf5;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.ui.conversation.c8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l4 f454334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f454335b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454336c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f454337d;

    public b(xf5.c cVar, com.tencent.mm.storage.l4 l4Var, boolean z17, java.lang.String str, long j17) {
        this.f454334a = l4Var;
        this.f454335b = z17;
        this.f454336c = str;
        this.f454337d = j17;
    }

    @Override // com.tencent.mm.ui.conversation.c8, com.tencent.mm.ui.conversation.d8
    public void b(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new xf5.a(this, j17), "refresh_box_conv_time");
    }
}
