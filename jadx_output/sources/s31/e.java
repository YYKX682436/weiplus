package s31;

/* loaded from: classes12.dex */
public final class e implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.Button f402435a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f402436b = jz5.h.b(s31.a.f402430d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f402437c = jz5.h.b(s31.b.f402431d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f402438d = jz5.h.b(new s31.c(this));

    /* renamed from: e, reason: collision with root package name */
    public s31.f f402439e;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f402435a == null) {
            this.f402435a = new android.widget.Button(context);
            c(null, this.f402439e);
        }
        android.widget.Button button = this.f402435a;
        kotlin.jvm.internal.o.d(button);
        return button;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        s31.f fVar = (s31.f) pVar;
        s31.f fVar2 = this.f402439e;
        this.f402439e = fVar;
        c(fVar2, fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(s31.f r22, s31.f r23) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s31.e.c(s31.f, s31.f):void");
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f402439e;
    }
}
