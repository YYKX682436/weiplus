package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f201449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f201450e;

    /* renamed from: f, reason: collision with root package name */
    public int f201451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201453h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ub f201454i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201455m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201456n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f201457o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(yz5.a aVar, android.widget.TextView textView, com.tencent.mm.ui.chatting.gallery.ub ubVar, java.lang.String str, yz5.a aVar2, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201452g = aVar;
        this.f201453h = textView;
        this.f201454i = ubVar;
        this.f201455m = str;
        this.f201456n = aVar2;
        this.f201457o = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.tb(this.f201452g, this.f201453h, this.f201454i, this.f201455m, this.f201456n, this.f201457o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.tb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.appcompat.app.AppCompatActivity context;
        java.lang.Object g17;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI;
        java.lang.Object g18;
        com.tencent.mm.ui.chatting.gallery.ob obVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f201451f;
        java.lang.String str = this.f201455m;
        yz5.a aVar2 = this.f201456n;
        com.tencent.mm.ui.chatting.gallery.ub ubVar = this.f201454i;
        android.widget.TextView textView = this.f201453h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (!((i18 == 788529167 || i18 == 788529166) || z65.c.a())) {
                return f0Var;
            }
            boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoGalleryDebugPath()) == 1;
            java.lang.Object m17 = c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, new java.lang.Integer(0));
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
            boolean z18 = ((java.lang.Integer) m17).intValue() == 1;
            if (!z17 && !z18) {
                return f0Var;
            }
            yz5.a aVar3 = this.f201452g;
            context = (aVar3 == null || (k1Var = (com.tencent.mm.ui.chatting.gallery.k1) aVar3.invoke()) == null || (imageGalleryUI = k1Var.f201092g) == null) ? null : imageGalleryUI.getContext();
            if (context == null) {
                return f0Var;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.ui.chatting.gallery.sb sbVar = new com.tencent.mm.ui.chatting.gallery.sb(ubVar, str, null);
            this.f201449d = context;
            this.f201451f = 1;
            g17 = kotlinx.coroutines.l.g(p0Var, sbVar, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.tencent.mm.ui.chatting.gallery.ob obVar2 = (com.tencent.mm.ui.chatting.gallery.ob) this.f201450e;
                context = (androidx.appcompat.app.AppCompatActivity) this.f201449d;
                kotlin.ResultKt.throwOnFailure(obj);
                g18 = obj;
                obVar = obVar2;
                com.tencent.mm.ui.chatting.gallery.nb nbVar = (com.tencent.mm.ui.chatting.gallery.nb) g18;
                textView.setText(com.tencent.mm.ui.chatting.gallery.ub.b(this.f201454i, context, this.f201455m, obVar, nbVar, (com.tencent.mm.ui.chatting.gallery.mb) aVar2.invoke()));
                if (((com.tencent.mm.ui.chatting.gallery.mb) aVar2.invoke()).f201203a == com.tencent.mm.ui.chatting.gallery.s8.f201364d && !nbVar.f201229c) {
                    com.tencent.mm.ui.chatting.gallery.ub ubVar2 = this.f201454i;
                    ubVar2.f201499a = kotlinx.coroutines.l.d(this.f201457o, null, null, new com.tencent.mm.ui.chatting.gallery.qb(this.f201452g, this.f201453h, ubVar2, context, this.f201455m, obVar, this.f201456n, null), 3, null);
                }
                return f0Var;
            }
            context = (androidx.appcompat.app.AppCompatActivity) this.f201449d;
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        com.tencent.mm.ui.chatting.gallery.ob obVar3 = (com.tencent.mm.ui.chatting.gallery.ob) g17;
        textView.setVisibility(0);
        ubVar.getClass();
        if (textView.getPaddingTop() == 0) {
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID);
            textView.setPadding(0, (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0) + ((int) (48 * context.getResources().getDisplayMetrics().density)), 0, 0);
        }
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310570c;
        com.tencent.mm.ui.chatting.gallery.rb rbVar = new com.tencent.mm.ui.chatting.gallery.rb(ubVar, str, aVar2, null);
        this.f201449d = context;
        this.f201450e = obVar3;
        this.f201451f = 2;
        g18 = kotlinx.coroutines.l.g(p0Var2, rbVar, this);
        if (g18 == aVar) {
            return aVar;
        }
        obVar = obVar3;
        com.tencent.mm.ui.chatting.gallery.nb nbVar2 = (com.tencent.mm.ui.chatting.gallery.nb) g18;
        textView.setText(com.tencent.mm.ui.chatting.gallery.ub.b(this.f201454i, context, this.f201455m, obVar, nbVar2, (com.tencent.mm.ui.chatting.gallery.mb) aVar2.invoke()));
        if (((com.tencent.mm.ui.chatting.gallery.mb) aVar2.invoke()).f201203a == com.tencent.mm.ui.chatting.gallery.s8.f201364d) {
            com.tencent.mm.ui.chatting.gallery.ub ubVar22 = this.f201454i;
            ubVar22.f201499a = kotlinx.coroutines.l.d(this.f201457o, null, null, new com.tencent.mm.ui.chatting.gallery.qb(this.f201452g, this.f201453h, ubVar22, context, this.f201455m, obVar, this.f201456n, null), 3, null);
        }
        return f0Var;
    }
}
