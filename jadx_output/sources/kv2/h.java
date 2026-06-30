package kv2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final kv2.h f312662a = new kv2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f312663b = kotlinx.coroutines.z0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f312664c = jz5.h.b(kv2.f.f312660d);

    public static final void c(java.lang.ref.WeakReference contextReference, dm.pd mention, int i17, so2.i msg) {
        kotlin.jvm.internal.o.g(contextReference, "contextReference");
        kotlin.jvm.internal.o.g(mention, "mention");
        kotlin.jvm.internal.o.g(msg, "msg");
        r45.vg2 vg2Var = mention.field_extInfo;
        if (vg2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, mentionExtInfo is null. position:" + i17);
            return;
        }
        int integer = vg2Var.getInteger(6);
        if (integer != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "bypassType is unknown:" + integer);
            return;
        }
        bw5.ic0 h17 = f312662a.h(mention);
        if (h17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, bypassMessage is null. position:" + i17);
            return;
        }
        int i18 = h17.f28523d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleTingFinderMention, bypassMessageType:");
        sb6.append(i18);
        sb6.append(", listen_id:");
        sb6.append(h17.hasFieldNumber(1) ? h17.f28524e : "");
        sb6.append(", category_id:");
        sb6.append(h17.hasFieldNumber(4) ? h17.f28525f : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", sb6.toString());
        kv2.a aVar = (kv2.a) ((java.util.Map) ((jz5.n) f312664c).getValue()).get(java.lang.Integer.valueOf(i18));
        if (aVar != null) {
            aVar.a(contextReference, mention, h17);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TingFinderMentionRouter", "routeMap not found handler for " + i18);
    }

    public final kv2.b a(dm.pd pdVar) {
        kv2.i g17;
        if (d(pdVar) && (g17 = g(pdVar)) != kv2.i.f312665d) {
            if (g17 == kv2.i.f312668g || g17 == kv2.i.f312669h) {
                return kv2.b.f312650e;
            }
            bw5.ic0 h17 = h(pdVar);
            if (g17 == kv2.i.f312666e) {
                if (h17 != null && h17.f28529m == 1) {
                    return kv2.b.f312650e;
                }
                if (h17 != null && h17.f28529m == 7) {
                    return kv2.b.f312651f;
                }
            }
            if (g17 == kv2.i.f312667f) {
                if (!(h17 != null && h17.f28529m == 3)) {
                    if (!(h17 != null && h17.f28529m == 2)) {
                        if (h17 != null && h17.f28529m == 4) {
                            return kv2.b.f312651f;
                        }
                    }
                }
                return kv2.b.f312650e;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentCgiTypeWithMention parse error, uniCommentBypassMessage?.listenItemType: ");
            sb6.append(h17 != null ? java.lang.Integer.valueOf(h17.f28529m) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.TingFinderMentionRouter", sb6.toString());
            return kv2.b.f312649d;
        }
        return kv2.b.f312649d;
    }

    public final kotlinx.coroutines.r2 b(java.lang.ref.WeakReference contextReference, long j17, long j18) {
        kotlin.jvm.internal.o.g(contextReference, "contextReference");
        return kotlinx.coroutines.l.d(f312663b, null, null, new kv2.c(contextReference, j17, j18, null), 3, null);
    }

    public final boolean d(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
        if (mention.field_sourceType != 1) {
            return false;
        }
        r45.vg2 vg2Var = mention.field_extInfo;
        if (vg2Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "handleTingFinderMention fail, mentionExtInfo is null");
            return false;
        }
        int integer = vg2Var.getInteger(6);
        if (integer == 4) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "bypassType is unknown:" + integer);
        return false;
    }

    public final com.tencent.mm.ui.widget.dialog.u3 e(java.lang.ref.WeakReference contextReference) {
        kotlin.jvm.internal.o.g(contextReference, "contextReference");
        android.app.Activity activity = (android.app.Activity) contextReference.get();
        if (activity != null) {
            return db5.e1.Q(activity, null, activity.getString(com.tencent.mm.R.string.ggd), true, false, kv2.g.f312661d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "showToast Loading, activity is null");
        return null;
    }

    public final void f(java.lang.ref.WeakReference contextReference, int i17) {
        kotlin.jvm.internal.o.g(contextReference, "contextReference");
        android.app.Activity activity = (android.app.Activity) contextReference.get();
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "showToast fail, activity is null");
        } else {
            db5.e1.i(activity, i17, 0);
        }
    }

    public final kv2.i g(dm.pd mention) {
        bw5.ic0 h17;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(mention, "mention");
        if (d(mention) && (h17 = h(mention)) != null) {
            int i19 = h17.f28523d;
            boolean z17 = true;
            java.lang.String str = h17.hasFieldNumber(1) ? h17.f28524e : "";
            java.lang.String str2 = h17.hasFieldNumber(4) ? h17.f28525f : "";
            if (i19 == 1) {
                if (!(str == null || str.length() == 0) && (i18 = h17.f28529m) > 0) {
                    return (i18 == 1 || i18 == 7) ? kv2.i.f312666e : kv2.i.f312667f;
                }
            }
            if (i19 == 2) {
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                if (!z17 && (i17 = h17.f28530n) > 0) {
                    if (i17 == 3) {
                        return kv2.i.f312668g;
                    }
                    if (i17 == 2 || i17 == 8 || i17 == 26) {
                        return kv2.i.f312669h;
                    }
                    return kv2.i.f312665d;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TingFinderMentionRouter", "tingFinderMentionSourceType parse error, bypassMessage.type: " + i19 + ", listenId: " + str + ", listenItemType: " + h17.f28529m + ", categoryId: " + str2 + ", categoryItemType: " + h17.f28530n);
            return kv2.i.f312665d;
        }
        return kv2.i.f312665d;
    }

    public final bw5.ic0 h(dm.pd pdVar) {
        com.tencent.mm.protobuf.g byteString = pdVar.field_extInfo.getByteString(5);
        if (byteString == null || byteString.f192156a.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingFinderMentionRouter", "uniCommentBypassMessageFromMention fail, bypassBuffer is empty");
            return null;
        }
        try {
            return new bw5.ic0().parseFrom(byteString.g());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingFinderMentionRouter", "uniCommentBypassMessageFromMention fail, parse bypassMessage error, e:" + e17.getLocalizedMessage());
            return null;
        }
    }
}
