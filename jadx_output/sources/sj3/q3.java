package sj3;

/* loaded from: classes14.dex */
public final class q3 extends com.tencent.mm.plugin.voip.widget.BaseSmallView implements com.tencent.mm.plugin.multitalk.model.a0 {

    /* renamed from: h, reason: collision with root package name */
    public final sj3.x1 f408709h;

    /* renamed from: i, reason: collision with root package name */
    public final sj3.u1 f408710i;

    /* renamed from: m, reason: collision with root package name */
    public final sj3.n1 f408711m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.PowerManager.WakeLock f408712n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f408713o;

    /* renamed from: p, reason: collision with root package name */
    public final bj3.b f408714p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3e, (android.view.ViewGroup) this, false);
        addView(inflate);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        int i17 = com.tencent.mm.R.id.jwn;
        android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.jwn);
        if (a17 != null) {
            int i18 = com.tencent.mm.R.id.h69;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(a17, com.tencent.mm.R.id.h69);
            if (linearLayout != null) {
                i18 = com.tencent.mm.R.id.f486028jx4;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(a17, com.tencent.mm.R.id.f486028jx4);
                if (weImageView != null) {
                    i18 = com.tencent.mm.R.id.f486029jx5;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(a17, com.tencent.mm.R.id.f486029jx5);
                    if (weImageView2 != null) {
                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) a17;
                        bj3.a aVar = new bj3.a(relativeLayout2, linearLayout, weImageView, weImageView2);
                        i17 = com.tencent.mm.R.id.jxd;
                        android.view.View a18 = x4.b.a(inflate, com.tencent.mm.R.id.jxd);
                        if (a18 != null) {
                            int i19 = com.tencent.mm.R.id.a9z;
                            android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(a18, com.tencent.mm.R.id.a9z);
                            if (imageView != null) {
                                i19 = com.tencent.mm.R.id.a_l;
                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(a18, com.tencent.mm.R.id.a_l);
                                if (relativeLayout3 != null) {
                                    i19 = com.tencent.mm.R.id.jw7;
                                    android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(a18, com.tencent.mm.R.id.jw7);
                                    if (relativeLayout4 != null) {
                                        int i27 = com.tencent.mm.R.id.jwk;
                                        android.widget.ImageView imageView2 = (android.widget.ImageView) x4.b.a(a18, com.tencent.mm.R.id.jwk);
                                        if (imageView2 != null) {
                                            i27 = com.tencent.mm.R.id.jwl;
                                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(a18, com.tencent.mm.R.id.jwl);
                                            if (textView != null) {
                                                i27 = com.tencent.mm.R.id.jx6;
                                                android.widget.ImageView imageView3 = (android.widget.ImageView) x4.b.a(a18, com.tencent.mm.R.id.jx6);
                                                if (imageView3 != null) {
                                                    i27 = com.tencent.mm.R.id.jx7;
                                                    com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) x4.b.a(a18, com.tencent.mm.R.id.jx7);
                                                    if (videoView != null) {
                                                        i27 = com.tencent.mm.R.id.jxc;
                                                        android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(a18, com.tencent.mm.R.id.jxc);
                                                        if (textView2 != null) {
                                                            i27 = com.tencent.mm.R.id.p7z;
                                                            android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) x4.b.a(a18, com.tencent.mm.R.id.p7z);
                                                            if (relativeLayout5 != null) {
                                                                i27 = com.tencent.mm.R.id.pm8;
                                                                android.widget.ImageView imageView4 = (android.widget.ImageView) x4.b.a(a18, com.tencent.mm.R.id.pm8);
                                                                if (imageView4 != null) {
                                                                    android.widget.RelativeLayout relativeLayout6 = (android.widget.RelativeLayout) a18;
                                                                    bj3.c cVar = new bj3.c(relativeLayout6, imageView, relativeLayout3, relativeLayout4, imageView2, textView, imageView3, videoView, textView2, relativeLayout5, imageView4);
                                                                    android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.jxg);
                                                                    if (a19 != null) {
                                                                        android.widget.RelativeLayout relativeLayout7 = (android.widget.RelativeLayout) x4.b.a(a19, com.tencent.mm.R.id.jw7);
                                                                        if (relativeLayout7 != null) {
                                                                            i19 = com.tencent.mm.R.id.jwi;
                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(a19, com.tencent.mm.R.id.jwi);
                                                                            if (weImageView3 != null) {
                                                                                i19 = com.tencent.mm.R.id.jxh;
                                                                                android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(a19, com.tencent.mm.R.id.jxh);
                                                                                if (textView3 != null) {
                                                                                    i19 = com.tencent.mm.R.id.jxi;
                                                                                    android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(a19, com.tencent.mm.R.id.jxi);
                                                                                    if (textView4 != null) {
                                                                                        android.widget.ImageView imageView5 = (android.widget.ImageView) x4.b.a(a19, com.tencent.mm.R.id.pm8);
                                                                                        if (imageView5 != null) {
                                                                                            android.widget.RelativeLayout relativeLayout8 = (android.widget.RelativeLayout) a19;
                                                                                            this.f408714p = new bj3.b(relativeLayout, relativeLayout, aVar, cVar, new bj3.d(relativeLayout8, relativeLayout7, weImageView3, textView3, textView4, imageView5));
                                                                                            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
                                                                                            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                                                                                            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) systemService).newWakeLock(536870922, "MicroMsg.MultiTalkSmallView");
                                                                                            this.f408712n = newWakeLock;
                                                                                            if (newWakeLock != null) {
                                                                                                yj0.a.c(newWakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "<init>", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                                                                                                newWakeLock.acquire();
                                                                                                yj0.a.f(newWakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "<init>", "(Landroid/content/Context;)V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
                                                                                            }
                                                                                            setClipToOutline(true);
                                                                                            this.f408709h = new sj3.x1(relativeLayout8);
                                                                                            this.f408710i = new sj3.u1(relativeLayout6);
                                                                                            this.f408711m = new sj3.n1(relativeLayout2);
                                                                                            return;
                                                                                        }
                                                                                        i19 = com.tencent.mm.R.id.pm8;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a19.getResources().getResourceName(i19)));
                                                                    }
                                                                    i17 = com.tencent.mm.R.id.jxg;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i19 = i27;
                                    }
                                }
                            }
                            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a18.getResources().getResourceName(i19)));
                        }
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(a17.getResources().getResourceName(i18)));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    private final java.lang.String getStateContentDesc() {
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sj3.n1 n1Var = this.f408711m;
        java.lang.String str = null;
        if ((n1Var == null || n1Var.f408653g) ? false : true) {
            android.content.Context context = getContext();
            if (context != null) {
                string = context.getString(com.tencent.mm.R.string.kcd);
            }
            string = null;
        } else {
            android.content.Context context2 = getContext();
            if (context2 != null) {
                string = context2.getString(com.tencent.mm.R.string.kcc);
            }
            string = null;
        }
        sb6.append(string);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        if (n1Var != null && n1Var.f408652f) {
            android.content.Context context3 = getContext();
            if (context3 != null) {
                str = context3.getString(com.tencent.mm.R.string.kcb);
            }
        } else {
            android.content.Context context4 = getContext();
            if (context4 != null) {
                str = context4.getString(com.tencent.mm.R.string.kca);
            }
        }
        sb8.append(str);
        return sb8.toString();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void a(java.lang.String userName, android.graphics.Bitmap bm6, int i17, int i18) {
        sj3.u1 u1Var;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(bm6, "bm");
        sj3.u1 u1Var2 = this.f408710i;
        if ((u1Var2 != null ? u1Var2.f408767o : null) != null) {
            if (!kotlin.jvm.internal.o.b(userName, u1Var2 != null ? u1Var2.f408767o : null) || (u1Var = this.f408710i) == null) {
                return;
            }
            synchronized (u1Var) {
                if (!u1Var.f408765m) {
                    if (u1Var.f408756d == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "drawVideo view is null");
                    } else if (u1Var.f408773u) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "renderVideoBitmap img false cause isDoingAnimationChange");
                    } else if (!u1Var.a(userName, bm6, i17, i18)) {
                        u1Var.d(bm6, i17, i18);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        android.os.SystemClock.elapsedRealtime();
                        u1Var.b(userName);
                        u1Var.f408764l = true;
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    public void b() {
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void c(boolean z17) {
        android.content.res.Resources resources;
        if (!z17) {
            super.c(false);
            return;
        }
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f408798b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = x1Var.f408799c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.kcl);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#FA5151"));
            }
            android.content.Context context = x1Var.f408800d;
            if (textView2 != null) {
                textView2.setContentDescription((context == null || (resources = context.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.jpv));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = x1Var.f408802f;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_filled_voice_call, android.graphics.Color.parseColor("#FA5151")));
            }
            if (weImageView == null) {
                return;
            }
            weImageView.setIconColor(android.graphics.Color.parseColor("#FA5151"));
        }
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public boolean d() {
        super.d();
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f408798b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = x1Var.f408802f;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(x1Var.f408800d, com.tencent.mm.R.raw.icon_filled_hangup, android.graphics.Color.parseColor("#FA5151")));
            }
            if (weImageView != null) {
                weImageView.setIconColor(android.graphics.Color.parseColor("#FA5151"));
            }
            android.widget.TextView textView2 = x1Var.f408799c;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#FA5151"));
            }
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.kc_);
            }
            x1Var.f408797a.clearAnimation();
        }
        sj3.u1 u1Var = this.f408710i;
        if (u1Var != null) {
            android.widget.TextView textView3 = u1Var.f408754b;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View view = u1Var.f408761i;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onHangupHappened", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = u1Var.f408762j;
            if (imageView != null) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(u1Var.f408755c, com.tencent.mm.R.raw.icons_filled_call_end, android.graphics.Color.parseColor("#FFFFFF")));
            }
            android.widget.TextView textView4 = u1Var.f408763k;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.widget.ImageView imageView2 = u1Var.f408758f;
            if (imageView2 != null) {
                imageView2.clearAnimation();
            }
            if (textView4 != null) {
                textView4.setText(com.tencent.mm.R.string.kc_);
            }
        }
        this.f408714p.f21159b.f21161a.setContentDescription("");
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void f() {
        sj3.u1 u1Var = this.f408710i;
        if (u1Var != null) {
            android.widget.TextView textView = u1Var.f408754b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View view = u1Var.f408761i;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "onResumeIconAndTipShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = x1Var.f408802f;
            if (weImageView != null) {
                weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(x1Var.f408800d, com.tencent.mm.R.raw.icon_filled_voice_call, android.graphics.Color.parseColor("#07C160")));
            }
            if (weImageView != null) {
                weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
            }
            android.widget.TextView textView2 = x1Var.f408799c;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (textView2 != null) {
                textView2.setTextColor(android.graphics.Color.parseColor("#07C160"));
            }
            android.widget.TextView textView3 = x1Var.f408798b;
            if (textView3 == null) {
                return;
            }
            textView3.setVisibility(0);
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getAvatarIv */
    public android.widget.ImageView getF150341g() {
        return null;
    }

    public final boolean getHasShowDeviceStatus() {
        return this.f408713o;
    }

    public final java.lang.Long getLastRenderSwitchTick() {
        sj3.u1 u1Var = this.f408710i;
        if (u1Var != null) {
            return u1Var.f408769q;
        }
        return null;
    }

    public final java.lang.String getRendererSpeaker() {
        java.lang.String str;
        sj3.u1 u1Var = this.f408710i;
        return (u1Var == null || (str = u1Var.f408767o) == null) ? "" : str;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.a0
    /* renamed from: getUsername */
    public java.lang.String getF150344m() {
        java.lang.String str;
        sj3.u1 u1Var = this.f408710i;
        return (u1Var == null || (str = u1Var.f408767o) == null) ? "" : str;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void j() {
        android.widget.ImageView imageView;
        this.f177088d = null;
        sj3.u1 u1Var = this.f408710i;
        if (u1Var != null && (imageView = u1Var.f408758f) != null) {
            imageView.clearAnimation();
        }
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            x1Var.f408797a.clearAnimation();
        }
        android.os.PowerManager.WakeLock wakeLock = this.f408712n;
        if (wakeLock != null) {
            kotlin.jvm.internal.o.d(wakeLock);
            if (wakeLock.isHeld()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkSmallView", "release waklock");
                if (wakeLock != null) {
                    yj0.a.c(wakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                    wakeLock.release();
                    yj0.a.f(wakeLock, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkSmallView", "uninit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void k(java.lang.String str) {
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f408798b;
            if (textView != null) {
                textView.setTextSize(1, 12.0f);
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        android.widget.RelativeLayout relativeLayout = this.f408714p.f21159b.f21161a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = getContext();
        sb6.append(context != null ? context.getString(com.tencent.mm.R.string.jpr) : null);
        sb6.append(getStateContentDesc());
        relativeLayout.setContentDescription(sb6.toString());
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void l(java.lang.String str) {
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            android.widget.TextView textView = x1Var.f408798b;
            if (textView != null) {
                textView.setTextSize(1, 14.0f);
            }
            if (textView != null) {
                textView.setText(str);
            }
        }
        bj3.b bVar = this.f408714p;
        bj3.c cVar = bVar.f21159b;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.multitalk.databinding.MultitalkVideoSmallContentViewBinding");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = getContext();
        sb6.append(context != null ? context.getString(com.tencent.mm.R.string.jpq) : null);
        sb6.append(getStateContentDesc());
        cVar.f21161a.setContentDescription(sb6.toString());
        android.widget.RelativeLayout relativeLayout = bVar.f21160c.f21162a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        android.content.Context context2 = getContext();
        sb7.append(context2 != null ? context2.getString(com.tencent.mm.R.string.jpq) : null);
        sb7.append(getStateContentDesc());
        relativeLayout.setContentDescription(sb7.toString());
    }

    public final void m(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Long lastRenderSwitchTick = getLastRenderSwitchTick();
        long longValue = lastRenderSwitchTick != null ? lastRenderSwitchTick.longValue() : 0L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - longValue);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MultiTalkSmallView", "changeRendererSpeaker %s", objArr);
        sj3.u1 u1Var = this.f408710i;
        if (u1Var == null) {
            return;
        }
        u1Var.g(str);
    }

    public void n() {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        sj3.x1 x1Var = this.f408709h;
        if (x1Var != null) {
            android.content.Context context = x1Var.f408800d;
            android.view.View view = x1Var.f408803g;
            if (view != null) {
                view.setBackground(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.drawable.b_6, (context == null || (resources2 = context.getResources()) == null) ? -1 : resources2.getColor(com.tencent.mm.R.color.f479450zn)));
            }
            if (context == null || (resources = context.getResources()) == null) {
                return;
            }
            int color = resources.getColor(com.tencent.mm.R.color.Brand_100);
            android.widget.TextView textView = x1Var.f408798b;
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    public final void o(java.lang.String userName) {
        sj3.u1 u1Var;
        kotlin.jvm.internal.o.g(userName, "userName");
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150174q.contains(userName) || (u1Var = this.f408710i) == null) {
            return;
        }
        u1Var.c(userName);
    }

    public final void p() {
        java.lang.Integer valueOf;
        sj3.x1 x1Var = this.f408709h;
        if (!((x1Var == null || (valueOf = java.lang.Integer.valueOf(x1Var.f408797a.getVisibility())) == null || valueOf.intValue() != 4) ? false : true)) {
            sj3.x1 x1Var2 = this.f408709h;
            if (x1Var2 != null) {
                android.view.View view = x1Var2.f408797a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = x1Var2.f408797a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVoiceView", "doAnimationHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = x1Var2.f408797a;
                view3.clearAnimation();
                view3.animate().alpha(0.0f).setDuration(300L).setListener(new sj3.v1(x1Var2)).start();
            }
            sj3.u1 u1Var = this.f408710i;
            if (u1Var != null) {
                u1Var.f(0);
            }
            sj3.u1 u1Var2 = this.f408710i;
            if (u1Var2 != null) {
                u1Var2.c(getRendererSpeaker());
            }
        }
        sj3.u1 u1Var3 = this.f408710i;
        if (u1Var3 == null) {
            return;
        }
        u1Var3.f408764l = true;
    }

    public final void setHasShowDeviceStatus(boolean z17) {
        this.f408713o = z17;
    }

    @Override // com.tencent.mm.plugin.voip.widget.BaseSmallView
    public void setVoicePlayDevice(int i17) {
        android.widget.TextView textView;
        if (this.f177089e != i17) {
            this.f408713o = true;
            this.f177089e = i17;
            sj3.u1 u1Var = this.f408710i;
            if (u1Var != null && (textView = u1Var.f408754b) != null) {
                textView.setVisibility(8);
            }
            if (u1Var != null) {
                android.view.View view = u1Var.f408761i;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "setVoicePlayDevice", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView2 = u1Var.f408763k;
                android.content.Context context = u1Var.f408755c;
                android.widget.ImageView imageView = u1Var.f408762j;
                if (i17 == 1) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_volume_up, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    kotlin.jvm.internal.o.d(textView2);
                    textView2.setText(com.tencent.mm.R.string.kc9);
                } else if (i17 == 2) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_ear, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    kotlin.jvm.internal.o.d(textView2);
                    textView2.setText(com.tencent.mm.R.string.kc7);
                } else if (i17 == 3) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_headset, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    kotlin.jvm.internal.o.d(textView2);
                    textView2.setText(com.tencent.mm.R.string.kc8);
                } else if (i17 == 4) {
                    if (imageView != null) {
                        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_bluetooth, android.graphics.Color.parseColor("#FFFFFF")));
                    }
                    kotlin.jvm.internal.o.d(textView2);
                    textView2.setText(com.tencent.mm.R.string.kc6);
                }
            }
            sj3.x1 x1Var = this.f408709h;
            if (x1Var != null) {
                android.widget.TextView textView3 = x1Var.f408799c;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                android.content.Context context2 = x1Var.f408800d;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = x1Var.f408802f;
                if (i17 == 1) {
                    if (weImageView != null) {
                        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icons_filled_volume_up, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (weImageView != null) {
                        weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.R.string.kc9);
                    }
                } else if (i17 == 2) {
                    if (weImageView != null) {
                        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icons_filled_ear, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (weImageView != null) {
                        weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.R.string.kc7);
                    }
                } else if (i17 == 3) {
                    if (weImageView != null) {
                        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icons_filled_headset, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (weImageView != null) {
                        weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.R.string.kc8);
                    }
                } else if (i17 == 4) {
                    if (weImageView != null) {
                        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.icons_filled_bluetooth, android.graphics.Color.parseColor("#07C160")));
                    }
                    if (weImageView != null) {
                        weImageView.setIconColor(android.graphics.Color.parseColor("#07C160"));
                    }
                    if (textView3 != null) {
                        textView3.setText(com.tencent.mm.R.string.kc6);
                    }
                }
                android.widget.TextView textView4 = x1Var.f408798b;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
            super.setVoicePlayDevice(i17);
        }
    }
}
