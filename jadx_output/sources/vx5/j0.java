package vx5;

/* loaded from: classes13.dex */
public class j0 extends com.tencent.xweb.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.u f441373a;

    public j0(com.tencent.xweb.pinus.sdk.WebView webView) {
        this.f441373a = webView.getSettings();
    }

    @Override // com.tencent.xweb.z0
    public void A(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.N;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setForceDarkBehavior", java.lang.Integer.TYPE);
                    vVar.N = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void B(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.L;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setForceDarkMode", java.lang.Integer.TYPE);
                    vVar.L = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void C(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220493v;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setGeolocationEnabled", java.lang.Boolean.TYPE);
                    vVar.f220493v = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void D(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220494w;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setJavaScriptCanOpenWindowsAutomatically", java.lang.Boolean.TYPE);
                    vVar.f220494w = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void E(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220495x;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setJavaScriptEnabled", java.lang.Boolean.TYPE);
                    vVar.f220495x = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void F(android.webkit.WebSettings.LayoutAlgorithm layoutAlgorithm) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220496y;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setLayoutAlgorithm", android.webkit.WebSettings.LayoutAlgorithm.class);
                    vVar.f220496y = i0Var;
                }
            }
            i0Var.b(layoutAlgorithm);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void G(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220497z;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setLoadWithOverviewMode", java.lang.Boolean.TYPE);
                    vVar.f220497z = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void H(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.A;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setLoadsImagesAutomatically", java.lang.Boolean.TYPE);
                    vVar.A = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void I(boolean z17) {
        ((com.tencent.xweb.pinus.sdk.v) this.f441373a).a(z17);
    }

    @Override // com.tencent.xweb.z0
    public void J(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.C;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setMixedContentMode", java.lang.Integer.TYPE);
                    vVar.C = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void K(android.webkit.WebSettings.RenderPriority renderPriority) {
    }

    @Override // com.tencent.xweb.z0
    public void L(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.D;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setSaveFormData", java.lang.Boolean.TYPE);
                    vVar.D = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void M(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.E;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setSavePassword", java.lang.Boolean.TYPE);
                    vVar.E = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void N(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.F;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setSupportZoom", java.lang.Boolean.TYPE);
                    vVar.F = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void O(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.G;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setTextZoom", java.lang.Integer.TYPE);
                    vVar.G = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void P(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.H;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setUseWideViewPort", java.lang.Boolean.TYPE);
                    vVar.H = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void Q(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.I;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setUserAgentString", java.lang.String.class);
                    vVar.I = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void R(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220471J;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setUsingForAppBrand", java.lang.Integer.TYPE);
                    vVar.f220471J = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void S(boolean z17) {
        ((com.tencent.xweb.pinus.sdk.v) this.f441373a).b(z17);
    }

    @Override // com.tencent.xweb.z0
    public void a(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.S;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "enableCustomizedLongPressTimeout", java.lang.Integer.TYPE);
                    vVar.S = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public boolean b() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220473b;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getAllowFileAccess", new java.lang.Class[0]);
                    vVar.f220473b = i0Var;
                }
            }
            return ((java.lang.Boolean) i0Var.b(new java.lang.Object[0])).booleanValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return false;
        }
    }

    @Override // com.tencent.xweb.z0
    public boolean c() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220474c;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getBlockNetworkImage", new java.lang.Class[0]);
                    vVar.f220474c = i0Var;
                }
            }
            return ((java.lang.Boolean) i0Var.b(new java.lang.Object[0])).booleanValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return false;
        }
    }

    @Override // com.tencent.xweb.z0
    public int d() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.O;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getForceDarkBehavior", new java.lang.Class[0]);
                    vVar.O = i0Var;
                }
            }
            return ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }

    @Override // com.tencent.xweb.z0
    public int e() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.M;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getForceDarkMode", new java.lang.Class[0]);
                    vVar.M = i0Var;
                }
            }
            return ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }

    @Override // com.tencent.xweb.z0
    public int f() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220476e;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getTextZoom", new java.lang.Class[0]);
                    vVar.f220476e = i0Var;
                }
            }
            return ((java.lang.Integer) i0Var.b(new java.lang.Object[0])).intValue();
        } catch (java.lang.UnsupportedOperationException unused) {
            return 0;
        }
    }

    @Override // com.tencent.xweb.z0
    public java.lang.String g() {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220477f;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "getUserAgentString", new java.lang.Class[0]);
                    vVar.f220477f = i0Var;
                }
            }
            return (java.lang.String) i0Var.b(new java.lang.Object[0]);
        } catch (java.lang.UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // com.tencent.xweb.z0
    public void h(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220478g;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAllowFileAccess", java.lang.Boolean.TYPE);
                    vVar.f220478g = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void i(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220479h;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAllowFileAccessFromFileURLs", java.lang.Boolean.TYPE);
                    vVar.f220479h = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void j(java.util.Map map) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.K;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAppBrandInfo", java.util.Map.class);
                    vVar.K = i0Var;
                }
            }
            i0Var.b(map);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void k(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220480i;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAppCacheEnabled", java.lang.Boolean.TYPE);
                    vVar.f220480i = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void l(long j17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220481j;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAppCacheMaxSize", java.lang.Long.TYPE);
                    vVar.f220481j = i0Var;
                }
            }
            i0Var.b(java.lang.Long.valueOf(j17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void m(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220482k;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAppCachePath", java.lang.String.class);
                    vVar.f220482k = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void n(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.P;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setAudioPlaybackRequiresUserGesture", java.lang.Boolean.TYPE);
                    vVar.P = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void o(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.U;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setBackForwardCacheEnabled", java.lang.Boolean.TYPE);
                    vVar.U = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void p(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.T;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setBackgroundAudioPause", java.lang.Boolean.TYPE);
                    vVar.T = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void q(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220483l;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setBlockNetworkImage", java.lang.Boolean.TYPE);
                    vVar.f220483l = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void r(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220484m;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setBuiltInZoomControls", java.lang.Boolean.TYPE);
                    vVar.f220484m = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void s(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220485n;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setCacheMode", java.lang.Integer.TYPE);
                    vVar.f220485n = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void t(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220486o;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDatabaseEnabled", java.lang.Boolean.TYPE);
                    vVar.f220486o = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void u(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220487p;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDatabasePath", java.lang.String.class);
                    vVar.f220487p = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void v(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220488q;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDefaultFontSize", java.lang.Integer.TYPE);
                    vVar.f220488q = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void w(java.lang.String str) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220489r;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDefaultTextEncodingName", java.lang.String.class);
                    vVar.f220489r = i0Var;
                }
            }
            i0Var.b(str);
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void x(int i17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220490s;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDisabledActionModeMenuItems", java.lang.Integer.TYPE);
                    vVar.f220490s = i0Var;
                }
            }
            i0Var.b(java.lang.Integer.valueOf(i17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void y(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220491t;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDisplayZoomControls", java.lang.Boolean.TYPE);
                    vVar.f220491t = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }

    @Override // com.tencent.xweb.z0
    public void z(boolean z17) {
        by5.i0 i0Var;
        com.tencent.xweb.pinus.sdk.v vVar = (com.tencent.xweb.pinus.sdk.v) this.f441373a;
        vVar.getClass();
        try {
            synchronized (vVar) {
                i0Var = vVar.f220492u;
                if (i0Var == null) {
                    i0Var = new by5.i0(vVar.f220472a, "setDomStorageEnabled", java.lang.Boolean.TYPE);
                    vVar.f220492u = i0Var;
                }
            }
            i0Var.b(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException unused) {
        }
    }
}
