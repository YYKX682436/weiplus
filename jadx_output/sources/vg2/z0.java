package vg2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.y0 f436635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yi6 f436637g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg2.b1 f436638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(vg2.y0 y0Var, vg2.r1 r1Var, r45.yi6 yi6Var, vg2.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436635e = y0Var;
        this.f436636f = r1Var;
        this.f436637g = yi6Var;
        this.f436638h = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vg2.z0(this.f436635e, this.f436636f, this.f436637g, this.f436638h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vg2.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView finderLiveGiftPreviewView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436634d;
        r45.yi6 yi6Var = this.f436637g;
        vg2.r1 r1Var = this.f436636f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = this.f436635e.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ce2.i iVar = r1Var.f436567h;
            this.f436634d = 1;
            obj = q4Var.q(context, iVar, yi6Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((r45.hb2) obj) != null) {
            r1Var.f436567h.field_switchSkinInfo.set(2, yi6Var.getString(0));
            java.util.Map map = dk2.u7.f234185e;
            if (map.containsKey(r1Var.f436567h.field_rewardProductId)) {
                ce2.i iVar2 = r1Var.f436567h;
                map.put(iVar2.field_rewardProductId, iVar2);
            }
            java.util.Map map2 = dk2.u7.f234189i;
            if (map2.containsKey(r1Var.f436567h.field_rewardProductId)) {
                ce2.i iVar3 = r1Var.f436567h;
                map2.put(iVar3.field_rewardProductId, iVar3);
            }
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(r1Var.f436567h);
            android.view.ViewGroup viewGroup = r1Var.f436569j;
            if (viewGroup != null && (finderLiveGiftPreviewView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftPreviewView) viewGroup.findViewById(com.tencent.mm.R.id.f2v)) != null) {
                finderLiveGiftPreviewView.c(finderLiveGiftPreviewView.f115947p, finderLiveGiftPreviewView.f115946o);
            }
            android.view.ViewGroup viewGroup2 = r1Var.f436569j;
            if (viewGroup2 != null && (textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.f484661f30)) != null) {
                textView.setText(java.lang.String.valueOf(r1Var.f436567h.P0()));
            }
            android.view.ViewGroup viewGroup3 = r1Var.f436569j;
            if (viewGroup3 != null && (imageView = (android.widget.ImageView) viewGroup3.findViewById(com.tencent.mm.R.id.f3o)) != null) {
                ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(r1Var.f436567h.R0(), com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
            }
            vg2.b1 b1Var = this.f436638h;
            java.lang.Object obj2 = b1Var.f436480d.get(b1Var.f436481e);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            vg2.r1.c(r1Var, (r45.yi6) obj2);
        }
        return jz5.f0.f302826a;
    }
}
