package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class c4 {
    public static final int a(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return -1;
        }
        int type = f9Var.getType();
        if (f9Var.k2()) {
            type = 49;
        }
        int i17 = 1;
        if (type != 1) {
            i17 = 2;
            if (type != 3) {
                if (type == 34) {
                    return 10;
                }
                if (type == 1040187441) {
                    return 11;
                }
                if (type == 42) {
                    return 20;
                }
                if (type == 43) {
                    return 3;
                }
                if (type == 66 || type == 67) {
                    return 20;
                }
                switch (type) {
                    case 47:
                        com.tencent.mm.feature.emoji.api.z5 z5Var = (com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class);
                        java.lang.String z07 = f9Var.z0();
                        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) z5Var).Ni(z07 != null ? z07 : "");
                        ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
                        kotlin.jvm.internal.o.f(com.tencent.mm.smiley.g.b(), "getInstance(...)");
                        return n22.m.e(Ni);
                    case 48:
                        return 6;
                    case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                        v05.b bVar = new v05.b();
                        java.lang.String U1 = f9Var.U1();
                        if (U1 == null) {
                            U1 = "";
                        }
                        bVar.fromXml(U1, "");
                        int integer = bVar.getInteger(bVar.f368365d + 6);
                        if (integer != 2) {
                            if (integer == 24) {
                                return 13;
                            }
                            i17 = 5;
                            if (integer != 33 && integer != 36) {
                                if (integer == 51) {
                                    return 8;
                                }
                                if (integer == 63) {
                                    return 12;
                                }
                                if (integer != 130) {
                                    if (integer == 5) {
                                        return 7;
                                    }
                                    if (integer != 6) {
                                        return -1;
                                    }
                                }
                                return 4;
                            }
                        }
                        return i17;
                    default:
                        return -1;
                }
            }
        }
        return i17;
    }

    public static final void b(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str2, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct forwardToWeWorkStruct = new com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct();
        forwardToWeWorkStruct.f58236d = num != null ? num.intValue() : 0L;
        if (str == null) {
            str = "";
        }
        forwardToWeWorkStruct.f58237e = forwardToWeWorkStruct.b("ChatName", str, true);
        forwardToWeWorkStruct.f58238f = num2 != null ? num2.intValue() : 0L;
        forwardToWeWorkStruct.f58239g = num3 != null ? num3.intValue() : 0L;
        if (str2 == null) {
            str2 = "";
        }
        forwardToWeWorkStruct.p(str2);
        forwardToWeWorkStruct.f58241i = i17;
        forwardToWeWorkStruct.k();
        java.lang.String n17 = forwardToWeWorkStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("ForwardReporter", "report%s %s", 27331, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }
}
