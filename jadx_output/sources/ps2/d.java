package ps2;

/* loaded from: classes10.dex */
public class d extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f358059c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f358060d;

    /* renamed from: e, reason: collision with root package name */
    public long f358061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String TAG) {
        super(str);
        kotlin.jvm.internal.o.g(TAG, "TAG");
        this.f358059c = TAG;
        this.f358061e = -1L;
    }

    @Override // bi4.o0
    public bi4.d1 a() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
        if (finderObject == null) {
            return null;
        }
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        ya2.b2 h17 = contact != null ? ya2.d.h(contact, null, false, 3, null) : null;
        return com.tencent.mm.plugin.finder.assist.n7.f102406a.i(h17 != null ? h17.w0() : null, h17 != null ? h17.getAvatarUrl() : null, finderObject.getId(), finderObject, null);
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        r45.xk a17;
        com.tencent.mm.protocal.protobuf.FinderContact contact2;
        com.tencent.mm.protocal.protobuf.FinderContact contact3;
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f358060d != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
            java.lang.String str2 = null;
            boolean b17 = kotlin.jvm.internal.o.b((finderObject == null || (contact3 = finderObject.getContact()) == null) ? null : contact3.getUsername(), xy2.c.e(context));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f358060d;
            if (finderObject2 != null && (contact2 = finderObject2.getContact()) != null) {
                str2 = contact2.getUsername();
            }
            intent.putExtra("finder_username", str2);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = this.f358060d;
            if (finderObject3 == null || (contact = finderObject3.getContact()) == null || (a17 = ya2.d.a(contact, false)) == null || (str = a17.getString(0)) == null) {
                str = "";
            }
            intent.putExtra("key_biz_username", str);
            ya2.e1 e1Var = ya2.e1.f460472a;
            if (b17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 20, 2);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(context, intent);
            }
        }
        return this.f358060d != null;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f358059c, "[doJump]");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "5")) {
            return false;
        }
        finderObject.parseFrom(android.util.Base64.decode(j0Var.f355141f, 0));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", finderObject.getId());
        intent.putExtra("feed_object_nonceId", finderObject.getObjectNonceId());
        intent.putExtra("key_need_related_list", false);
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(n7Var.h(com.tencent.mm.plugin.finder.assist.n7.j(n7Var, com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0), false, null, 4, null)), null, null));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedId", pm0.v.u(finderObject.getId()));
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        jSONObject.put("finderusername", contact != null ? contact.getUsername() : null);
        intent.putExtra("key_extra_info", jSONObject.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 25, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        kotlin.jvm.internal.o.d(context);
        zy2.ta.b(e1Var, context, intent, false, 4, null);
        return true;
    }

    @Override // bi4.o0
    public java.lang.CharSequence f() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        return (!l() || (finderObject = this.f358060d) == null || (contact = finderObject.getContact()) == null) ? "" : ya2.d.h(contact, null, false, 3, null).w0();
    }

    @Override // bi4.o0
    public java.lang.String h() {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
        java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(finderObject != null ? finderObject.getId() : 0L);
        kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        if (!l()) {
            return "";
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
        java.lang.String description = (finderObject == null || (objectDesc = finderObject.getObjectDesc()) == null) ? null : objectDesc.getDescription();
        return description == null ? "" : description;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public boolean k() {
        return false;
    }

    @Override // bi4.o0
    public boolean l() {
        java.util.HashMap hashMap = com.tencent.mm.plugin.finder.view.w.f133270o;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
        java.lang.Boolean bool = (java.lang.Boolean) com.tencent.mm.plugin.finder.view.w.f133270o.get(java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        java.util.Objects.toString(j0Var);
        super.m(str, j0Var);
        if (j0Var == null || com.tencent.mm.sdk.platformtools.t8.K0(j0Var.f355141f)) {
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f355141f, 0);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        this.f358060d = finderObject;
        finderObject.parseFrom(decode);
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        container.removeAllViews();
        if (!l()) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(this.f358059c);
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.addView(imageView);
        r(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        container.toString();
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(this.f358059c);
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        r(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(container, "container");
        container.toString();
        boolean l17 = l();
        boolean z17 = false;
        java.lang.String str = this.f358059c;
        if (l17) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
            if (finderObject == null) {
                f0Var = null;
            } else {
                if (finderObject.getId() == this.f358061e) {
                    return true;
                }
                this.f358061e = finderObject.getId();
                android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(str);
                if (imageView == null) {
                    imageView = new android.widget.ImageView(container.getContext());
                    imageView.setTag(str);
                    container.removeAllViews();
                    container.addView(imageView);
                }
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, finderObject.getObjectType());
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc != null && objectDesc.getMediaType() == 2) {
                    z17 = true;
                }
                com.tencent.mm.plugin.finder.storage.y90 y90Var = z17 ? com.tencent.mm.plugin.finder.storage.y90.f128355e : com.tencent.mm.plugin.finder.storage.y90.f128356f;
                if (com.tencent.mm.sdk.platformtools.t8.L0(a17.getMediaList())) {
                    com.tencent.mars.xlog.Log.w(str, "setCustomThumbView: mediaList:" + a17.getMediaList());
                } else {
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    vo0.d e17 = g1Var.e();
                    r45.mb4 first = a17.getMediaList().getFirst();
                    kotlin.jvm.internal.o.f(first, "getFirst(...)");
                    wo0.c b17 = e17.b(new mn2.u0(first, y90Var, null, 4, null), g1Var.h(mn2.f1.f329953d));
                    ps2.c cVar = new ps2.c(imageView);
                    b17.getClass();
                    b17.f447873d = cVar;
                    b17.a();
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(str, "setCustomThumbView: finderObject is null");
            }
        } else {
            android.view.View findViewWithTag = container.findViewWithTag("Finder.TextStatusProvider.invalidView");
            if (findViewWithTag == null) {
                findViewWithTag = com.tencent.mm.ui.id.b(container.getContext()).inflate(com.tencent.mm.R.layout.b_5, (android.view.ViewGroup) container, false);
                kotlin.jvm.internal.o.f(findViewWithTag, "inflate(...)");
                findViewWithTag.setTag("Finder.TextStatusProvider.invalidView");
                container.removeAllViews();
                container.addView(findViewWithTag);
            }
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) m17;
            if (!(str2.length() == 0)) {
                com.tencent.mars.xlog.Log.i(str, "[checkShowValidLayout] wording=".concat(str2));
                android.widget.TextView textView = (android.widget.TextView) findViewWithTag.findViewById(com.tencent.mm.R.id.hei);
                if (textView != null) {
                    textView.setText(str2);
                }
            }
            android.view.View findViewById = findViewWithTag.findViewById(com.tencent.mm.R.id.heg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewWithTag.findViewById(com.tencent.mm.R.id.heh);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = findViewWithTag.findViewById(com.tencent.mm.R.id.h0d);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return true;
    }

    public final void r(android.widget.ImageView imageView) {
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f358060d;
        java.lang.String avatarUrl = (finderObject == null || (contact = finderObject.getContact()) == null) ? null : ya2.d.h(contact, null, false, 3, null).getAvatarUrl();
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(avatarUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
    }
}
