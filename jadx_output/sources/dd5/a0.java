package dd5;

/* loaded from: classes9.dex */
public final class a0 extends uc5.z {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.a0 f229082p = new dd5.a0();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0() {
        super(dd5.d0.f229111c);
        dd5.d0.f229110b.getClass();
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.e2 binding = (em.e2) obj;
        dd5.c0 c0Var = (dd5.c0) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (c0Var == null) {
            return;
        }
        if (binding.a().getChildCount() == 0) {
            binding.a().a();
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView a17 = binding.a();
            a17.getClass();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            a17.addView(a17.f190826m, layoutParams);
        }
        binding.a().c(c0Var.f229099c, c0Var.f229098b, true, true);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.e2 binding = (em.e2) obj;
        dd5.c0 c0Var = (dd5.c0) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (c0Var == null) {
            return;
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = c0Var.f229099c;
        if (iEmojiInfo.k()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHistoryGalleryTypeEmoji", "onItemBodyClick: game emoji click disabled, skip");
            return;
        }
        java.lang.String md52 = iEmojiInfo.getMd5();
        if (md52 == null) {
            md52 = "";
        }
        qk.u uVar = new qk.u(md52, iEmojiInfo);
        java.lang.String S = iEmojiInfo.S();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        uVar.f364005g = S != null ? S : "";
        ((com.tencent.mm.feature.emoji.f4) ((com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class))).wi(context, uVar);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        com.tencent.mm.api.IEmojiInfo Di;
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            return null;
        }
        java.util.List f07 = r26.n0.f0(j17, new java.lang.String[]{":"}, false, 0, 6, null);
        if (f07.size() > 3 && (Di = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Di((str = (java.lang.String) f07.get(3)))) != null) {
            return new dd5.c0(str, f9Var.getMsgId(), Di);
        }
        return null;
    }
}
