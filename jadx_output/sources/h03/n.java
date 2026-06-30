package h03;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h03.q f277902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f277903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f277904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f277905h;

    public n(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, h03.q qVar, long j17, byte[] bArr, android.app.Activity activity) {
        this.f277901d = megaVideoFeedInfo;
        this.f277902e = qVar;
        this.f277903f = j17;
        this.f277904g = bArr;
        this.f277905h = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.q f76;
        fc2.q f77;
        fc2.q f78;
        so2.u1 d17 = c03.i.d(this.f277901d);
        if (d17 != null) {
            this.f277902e.b(d17.getFeedObject(), (int) this.f277903f);
            byte[] bArr = this.f277904g;
            android.app.Activity context = this.f277905h;
            if (bArr != null) {
                bw5.jd0 parseFrom = new bw5.jd0().parseFrom(bArr);
                int i17 = parseFrom.f28939o;
                int i18 = parseFrom.f28936i;
                int videoDuration = d17.getFeedObject().getVideoDuration() * 1000;
                if (videoDuration > 0) {
                    ec2.f fVar = new ec2.f(3);
                    fVar.f250964i = videoDuration;
                    float f17 = videoDuration;
                    fVar.f250963h = (int) ((i17 / 100.0f) * f17);
                    kotlin.jvm.internal.o.g(context, "context");
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    if (nyVar != null && (f78 = nyVar.f7()) != null) {
                        f78.a(fVar);
                    }
                    ec2.f fVar2 = new ec2.f(3);
                    fVar2.f250964i = videoDuration;
                    fVar2.f250963h = (int) ((i18 / 100.0f) * f17);
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    if (nyVar2 != null && (f77 = nyVar2.f7()) != null) {
                        f77.a(fVar2);
                    }
                }
            }
            ec2.f fVar3 = new ec2.f(6);
            fVar3.f250965j = d17.getItemId();
            fVar3.f250966k = d17.w();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar3 == null || (f76 = nyVar3.f7()) == null) {
                return;
            }
            f76.a(fVar3);
        }
    }
}
