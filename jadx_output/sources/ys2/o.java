package ys2;

/* loaded from: classes10.dex */
public final class o extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f465173m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f465174n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f465175o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f465176p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f465177q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.TextureView f465178r;

    /* renamed from: s, reason: collision with root package name */
    public kk4.c f465179s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f465180t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f465173m = "ReplayThumbController";
    }

    public static final float Z6(ys2.o oVar, android.widget.SeekBar seekBar) {
        oVar.getClass();
        float intrinsicWidth = pm0.v.t(seekBar)[0] + seekBar.getThumb().getBounds().left + (seekBar.getThumb().getIntrinsicWidth() / 2.0f);
        kotlin.jvm.internal.o.d(oVar.f465176p);
        return intrinsicWidth - (r2.getMeasuredWidth() / 2.0f);
    }

    public static final float a7(ys2.o oVar, android.widget.SeekBar seekBar) {
        oVar.getClass();
        int i17 = pm0.v.t(seekBar)[1];
        kotlin.jvm.internal.o.d(oVar.f465174n);
        return (i17 - r1.getMeasuredHeight()) - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b7(ys2.o oVar, android.widget.SeekBar seekBar) {
        int b17 = a06.d.b((seekBar.getProgress() / seekBar.getMax()) * ((ct2.j) oVar.business(ct2.j.class)).S6());
        android.widget.TextView textView = oVar.f465177q;
        boolean z17 = false;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = oVar.f465177q;
        if (textView2 != null) {
            no0.l lVar = no0.m.f338730a;
            textView2.setText(b17 >= 3600 ? no0.l.a(lVar, b17, ":", true, false, false, 24, null) : no0.l.a(lVar, b17, ":", false, false, false, 24, null));
        }
        com.tencent.mm.protobuf.e eVar = null;
        if (oVar.f465180t) {
            kk4.c cVar = oVar.f465179s;
            if (cVar != null && ((kk4.f0) cVar).getCurrentState() == 4) {
                kk4.c cVar2 = oVar.f465179s;
                long playerBufferedDurationMs = cVar2 != null ? ((kk4.f0) cVar2).getPlayerBufferedDurationMs() : 0L;
                int i17 = b17 * 1000;
                if (playerBufferedDurationMs >= i17) {
                    kk4.c cVar3 = oVar.f465179s;
                    if (cVar3 != null) {
                        android.widget.ImageView imageView = oVar.f465175o;
                        if (imageView != null) {
                            imageView.setVisibility(4);
                        }
                        android.view.TextureView textureView = oVar.f465178r;
                        if (!(textureView instanceof android.view.View)) {
                            textureView = null;
                        }
                        if (textureView != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            android.view.TextureView textureView2 = textureView;
                            yj0.a.d(textureView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "updateThumbContent", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textureView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(textureView2, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "updateThumbContent", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        ((kk4.f0) cVar3).seekTo(i17);
                        java.util.LinkedList linkedList = ((ct2.o) oVar.business(ct2.o.class)).f222297h;
                        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            java.lang.Object previous = listIterator.previous();
                            if (((r45.tr5) previous).getInteger(1) <= b17) {
                                eVar = previous;
                                break;
                            }
                        }
                        r45.tr5 tr5Var = (r45.tr5) eVar;
                        if (tr5Var != null) {
                            oVar.d7(tr5Var.getInteger(2) > tr5Var.getInteger(0));
                        }
                        android.view.ViewGroup viewGroup = oVar.f465176p;
                        if (viewGroup != null && viewGroup.isShown()) {
                            kk4.c cVar4 = oVar.f465179s;
                            if (cVar4 != null && ((kk4.f0) cVar4).getCurrentState() == 4) {
                                z17 = true;
                            }
                            if (z17) {
                                android.view.ViewGroup viewGroup2 = oVar.f465176p;
                                kotlin.jvm.internal.o.d(viewGroup2);
                                float width = viewGroup2.getWidth();
                                kotlin.jvm.internal.o.d(oVar.f465176p);
                                float height = width / r2.getHeight();
                                kk4.c cVar5 = oVar.f465179s;
                                kotlin.jvm.internal.o.d(cVar5);
                                float videoWidth = ((kk4.f0) cVar5).getVideoWidth();
                                kotlin.jvm.internal.o.d(oVar.f465179s);
                                float videoHeight = videoWidth / ((kk4.f0) r3).getVideoHeight();
                                if (videoHeight > height) {
                                    android.view.TextureView textureView3 = oVar.f465178r;
                                    if (textureView3 != null) {
                                        kotlin.jvm.internal.o.d(oVar.f465176p);
                                        float height2 = r4.getHeight() * videoHeight;
                                        kotlin.jvm.internal.o.d(oVar.f465176p);
                                        textureView3.setScaleX(height2 / r2.getWidth());
                                    }
                                    android.view.TextureView textureView4 = oVar.f465178r;
                                    if (textureView4 == null) {
                                        return;
                                    }
                                    textureView4.setScaleY(1.0f);
                                    return;
                                }
                                android.view.TextureView textureView5 = oVar.f465178r;
                                if (textureView5 != null) {
                                    textureView5.setScaleX(1.0f);
                                }
                                android.view.TextureView textureView6 = oVar.f465178r;
                                if (textureView6 == null) {
                                    return;
                                }
                                kotlin.jvm.internal.o.d(oVar.f465176p);
                                kotlin.jvm.internal.o.d(oVar.f465176p);
                                textureView6.setScaleY((r3.getWidth() / videoHeight) / r0.getHeight());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        android.view.TextureView textureView7 = oVar.f465178r;
        if (textureView7 != null) {
            textureView7.setVisibility(8);
        }
        ct2.o oVar2 = (ct2.o) oVar.business(ct2.o.class);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = oVar2.f222296g;
        if (!copyOnWriteArrayList.isEmpty()) {
            r45.gp5 gp5Var = (r45.gp5) kz5.n0.i0(copyOnWriteArrayList);
            if (b17 > (gp5Var != null ? gp5Var.getInteger(0) : 0) && oVar2.f222300n) {
                oVar2.N6(null);
                oVar2.f222300n = false;
            }
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            int i18 = Integer.MAX_VALUE;
            int i19 = 0;
            int i27 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                int abs = java.lang.Math.abs(((r45.gp5) next).getInteger(0) - b17);
                if (abs < i18) {
                    i19 = i27;
                    i18 = abs;
                }
                i27 = i28;
            }
            eVar = (r45.gp5) copyOnWriteArrayList.get(i19);
        }
        if (eVar != null) {
            android.widget.ImageView imageView2 = oVar.f465175o;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(eVar.getString(1), com.tencent.mm.plugin.finder.storage.y90.f128356f));
            a17.f447873d = new ys2.n(oVar);
            a17.f();
            return;
        }
        android.widget.ImageView imageView3 = oVar.f465175o;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.TextView textView3 = oVar.f465177q;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(8);
    }

    public final void c7() {
        android.view.View view = this.f465174n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null) {
            mgVar.K0(0);
        }
    }

    public final void d7(boolean z17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.view.ViewGroup viewGroup = this.f465176p;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        if (z17 == (layoutParams.width > layoutParams.height)) {
            return;
        }
        if (z17) {
            layoutParams.width = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
            layoutParams.height = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.by);
        } else {
            layoutParams.width = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.by);
            layoutParams.height = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479670c7);
        }
        android.view.ViewGroup viewGroup2 = this.f465176p;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(layoutParams);
    }

    public final void e7(boolean z17) {
        this.f465180t = z17;
        android.view.View view = this.f465174n;
        if (view != null) {
            view.measure(0, 0);
        }
        android.view.View view2 = this.f465174n;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null) {
            mgVar.K0(8);
        }
    }

    public final void f7(float f17, float f18) {
        android.view.View view = this.f465174n;
        if (view != null) {
            view.setX(f17);
        }
        android.view.View view2 = this.f465174n;
        if (view2 == null) {
            return;
        }
        view2.setY(f18);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f465179s = ((cf0.q) qVar).wi(context);
        ((ct2.o) business(ct2.o.class)).N6(new ys2.k(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        kk4.c cVar = this.f465179s;
        if (cVar != null) {
            cVar.release();
        }
        this.f465179s = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.lyu);
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.getVisibility();
        this.f465174n = viewGroup.findViewById(com.tencent.mm.R.id.o78);
        this.f465175o = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.l47);
        this.f465176p = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.o6y);
        this.f465177q = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f486476lc3);
        android.view.TextureView textureView = (android.view.TextureView) viewGroup.findViewById(com.tencent.mm.R.id.f487299o74);
        this.f465178r = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new ys2.j(this));
        }
        at2.y1 y1Var = (at2.y1) R6(at2.y1.class);
        if (y1Var != null) {
            ys2.l lVar = new ys2.l(this);
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = y1Var.f13781q;
            finderLiveReplaySeekbar.getClass();
            ((java.util.ArrayList) finderLiveReplaySeekbar.f124928p).add(lVar);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        android.view.View view = this.f465174n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = this.f465175o;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f465174n = null;
        this.f465175o = null;
        this.f465176p = null;
        this.f465177q = null;
        this.f465180t = false;
        this.f465178r = null;
    }
}
