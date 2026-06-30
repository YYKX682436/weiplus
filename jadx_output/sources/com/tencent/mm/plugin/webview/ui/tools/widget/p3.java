package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class p3 extends com.tencent.mm.plugin.webview.ui.tools.widget.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.x3 f187494e = new com.tencent.mm.plugin.webview.ui.tools.widget.x3();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.u3 f187495f;

    public p3(com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var) {
        this.f187495f = u3Var;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void Ae(android.os.Bundle bundle) {
        e().Ae(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean Cg(com.tencent.mm.plugin.webview.stub.h hVar) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187495f;
        if (u3Var.f187549b == null) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "onSceneEnd, instance hashcode = " + u3Var.f187549b.hashCode());
        u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.e3(this, hVar.getType(), hVar.Pg(), hVar.getErrCode(), hVar.getErrMsg(), hVar.getData()));
        return e().Cg(hVar);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void D3(java.lang.String str, java.lang.String str2) {
        e().D3(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String E6() {
        return this.f187495f.f187562o;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle H6(java.lang.String str, java.lang.String str2) {
        return e().H6(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void Ic(java.lang.String str, java.lang.String str2) {
        e().Ic(str, str2);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void V1() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        nw4.n nVar = this.f187495f.f187554g;
        if (nVar == null || (n3Var = nVar.f340892f) == null) {
            return;
        }
        n3Var.post(new nw4.s0(nVar));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void W1(java.lang.String str) {
        e().W1(str);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187495f;
        if (u3Var.f187554g == null) {
            return false;
        }
        u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.f3(this, str, str2, bundle, z17));
        e().aj(str, str2, bundle, z17);
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void b(android.os.Bundle bundle) {
        e().b(bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean callback(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "callback, actionCode = " + i17);
        com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187495f;
        if (i17 != 90) {
            if (i17 == 2008) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(dm.i4.COL_LOCALID, bundle.getString(dm.i4.COL_LOCALID));
                hashMap.put("err_msg", bundle.getString("recordResult"));
                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.x2(this, hashMap));
            } else if (i17 == 2010) {
                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.o3(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
            } else if (i17 == 1002) {
                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.g3(this, bundle));
            } else if (i17 != 1003) {
                switch (i17) {
                    case 1006:
                        if (u3Var.f187554g != null) {
                            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.y2(this, bundle));
                            break;
                        }
                        break;
                    case 1007:
                        u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.j3(this, bundle.getString("download_manager_appid", ""), bundle.getLong("download_manager_downloadid"), bundle.getInt("download_manager_progress"), bundle.getFloat("download_manager_progress_float")));
                        break;
                    case 1008:
                        u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.i3(this, bundle));
                        break;
                    default:
                        switch (i17) {
                            case 2002:
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                hashMap2.put("err_msg", bundle.getString("playResult"));
                                hashMap2.put(dm.i4.COL_LOCALID, bundle.getString(dm.i4.COL_LOCALID));
                                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.w2(this, hashMap2));
                                break;
                            case 2003:
                                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.k3(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case 2004:
                                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.l3(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS /* 2005 */:
                                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.m3(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            case com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END /* 2006 */:
                                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.n3(this, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                break;
                            default:
                                switch (i17) {
                                    case 121000:
                                        if (!((km0.c) gm0.j1.p().a()).a() && u3Var.f187554g != null) {
                                            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.a3(this, bundle));
                                            break;
                                        }
                                        break;
                                    case 121001:
                                        if (!((km0.c) gm0.j1.p().a()).a() && u3Var.f187554g != null) {
                                            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.b3(this, bundle));
                                            break;
                                        }
                                        break;
                                    case 121002:
                                        if (!((km0.c) gm0.j1.p().a()).a() && u3Var.f187554g != null) {
                                            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.c3(this, bundle));
                                            break;
                                        }
                                        break;
                                    case 121003:
                                        if (u3Var.f187554g != null) {
                                            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.d3(this, bundle));
                                            break;
                                        }
                                        break;
                                    default:
                                        com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "undefine action code!!!");
                                        break;
                                }
                        }
                }
            } else {
                u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.h3(this, bundle));
            }
        } else if (u3Var.f187554g != null) {
            u3Var.f187550c.post(new com.tencent.mm.plugin.webview.ui.tools.widget.z2(this, bundle));
        }
        e().callback(i17, bundle);
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void d5(boolean z17) {
        e().d5(z17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void da(boolean z17) {
        e().da(z17);
    }

    public final com.tencent.mm.plugin.webview.ui.tools.widget.x3 e() {
        com.tencent.mm.plugin.webview.ui.tools.widget.x3 G = this.f187495f.G();
        return G == null ? this.f187494e : G;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void ec() {
        java.util.LinkedList linkedList;
        nw4.n nVar = this.f187495f.f187554g;
        if (nVar == null || (linkedList = nVar.f340891e) == null) {
            return;
        }
        linkedList.clear();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String getCurrentUrl() {
        return this.f187495f.E();
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        return e().i(i17, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        e().t3(str, str2, i17, i18);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void te(int i17, android.os.Bundle bundle) {
        e().te(i17, bundle);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public boolean v3(int i17) {
        return e().v3(i17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public void w8(boolean z17) {
        e().w8(z17);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x3, com.tencent.mm.plugin.webview.stub.z0
    public java.lang.String za() {
        return e().za();
    }
}
