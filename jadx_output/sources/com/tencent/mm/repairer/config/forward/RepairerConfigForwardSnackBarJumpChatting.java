package com.tencent.mm.repairer.config.forward;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/repairer/config/forward/RepairerConfigForwardSnackBarJumpChatting;", "Lq55/i;", "<init>", "()V", "v55/b", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigForwardSnackBarJumpChatting extends q55.i {

    /* renamed from: a, reason: collision with root package name */
    public static final v55.b f192214a = new v55.b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f192215b = jz5.h.b(v55.a.f433367d);

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ForwardSnackBarJumpChatting";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "转发后SnackBar跳Chatting";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupForward.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return java.lang.Integer.valueOf(((i17 == 788529167 || i17 == 788529166) || z65.c.a()) ? 1 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_forward_snack_bar_jump_chatting";
    }
}
