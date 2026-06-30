package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class p {
    public void a() {
        int i17;
        int i18;
        byte[] bArr = {0};
        byte[] bArr2 = new byte[2];
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "hy: audio info dump begin");
        wo.c cVar = wo.v1.f447823c;
        cVar.c();
        int i19 = cVar.K;
        if (i19 > -1) {
            bArr2[0] = (byte) i19;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(406, bArr2, 1);
        } else if (i19 == -2) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(407, bArr, 1);
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mt_cldnn_ns, -1);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mt_cldnn_ns_ct, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, cldnn_ns_config:%d, cldnn_ns_ct:%d", java.lang.Integer.valueOf(Ni), java.lang.Integer.valueOf(Ni2));
        if (Ni > 0) {
            int i27 = Ni & 1;
            int i28 = (Ni >> 1) & 3;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, cldnn ns para: %d, %d, %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(Ni2));
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(470, new byte[]{(byte) (i27 & 255), (byte) ((i27 >> 8) & 255), (byte) ((i27 >> 16) & 255), (byte) ((i27 >> 24) & 255), (byte) (i28 & 255), (byte) ((i28 >> 8) & 255), (byte) ((i28 >> 16) & 255), (byte) ((i28 >> 24) & 255), (byte) (Ni2 & 255), (byte) ((Ni2 >> 8) & 255), (byte) ((Ni2 >> 16) & 255), (byte) ((Ni2 >> 24) & 255)}, 3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc2, SrvDeviceInfo.mAudioInfo.waveAgcMode:%d", java.lang.Integer.valueOf(cVar.f447590a0));
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc1, SrvDeviceInfo.mAudioInfo.agcMode:%d", java.lang.Integer.valueOf(cVar.O));
        java.lang.String Vi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Vi(e42.c0.clicfg_mt_agc_device_params, "{\"agc_flag\":-1,\"agc_type\":-1,\"agc_mode\":-1,\"agc_params\":-1}");
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc y-expt device params:%s", Vi);
        try {
            cl0.g gVar = new cl0.g(Vi);
            int intValue = ((java.lang.Integer) gVar.get("agc_flag")).intValue();
            int intValue2 = ((java.lang.Integer) gVar.get("agc_type")).intValue();
            int intValue3 = ((java.lang.Integer) gVar.get("agc_mode")).intValue();
            int intValue4 = ((java.lang.Integer) gVar.get("agc_params")).intValue();
            if (intValue == 1) {
                if (intValue2 == 1) {
                    if (intValue3 == 3) {
                        byte b17 = (byte) intValue3;
                        byte[] bArr3 = {b17, (byte) (intValue4 & 31), (byte) ((intValue4 >> 5) & 31), (byte) ((intValue4 >> 10) & 31), (byte) ((intValue4 >> 15) & 31), 1, 5, 1};
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc1 y-device paras: %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(b17), java.lang.Byte.valueOf(bArr3[1]), java.lang.Byte.valueOf(bArr3[2]), java.lang.Byte.valueOf(bArr3[3]), java.lang.Byte.valueOf(bArr3[4]), java.lang.Byte.valueOf(bArr3[5]), java.lang.Byte.valueOf(bArr3[6]), java.lang.Byte.valueOf(bArr3[7]));
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(404, bArr3, 8);
                    }
                } else if (intValue2 == 2) {
                    if (intValue3 == 1) {
                        byte[] bArr4 = {(byte) intValue3, (byte) (intValue4 & 31), 30, 15, (byte) ((intValue4 >> 5) & 31), 1, 5, (byte) ((intValue4 >> 10) & 1), (byte) ((intValue4 >> 11) & 31), (byte) ((intValue4 >> 16) & 31), (byte) ((intValue4 >> 21) & 31)};
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(461, bArr4, 11);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc2 y-device paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr4[1]), java.lang.Byte.valueOf(bArr4[2]), java.lang.Byte.valueOf(bArr4[3]), java.lang.Byte.valueOf(bArr4[4]), java.lang.Byte.valueOf(bArr4[5]), java.lang.Byte.valueOf(bArr4[6]), java.lang.Byte.valueOf(bArr4[7]), java.lang.Byte.valueOf(bArr4[8]), java.lang.Byte.valueOf(bArr4[9]), java.lang.Byte.valueOf(bArr4[10]));
                    } else if (intValue3 == 2) {
                        byte[] bArr5 = {(byte) intValue3, (byte) (intValue4 & 31), (byte) ((intValue4 >> 5) & 31), (byte) ((intValue4 >> 10) & 31), (byte) ((intValue4 >> 15) & 31), 1, 5};
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(461, bArr5, 7);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc2 y-device paras: %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr5[1]), java.lang.Byte.valueOf(bArr5[2]), java.lang.Byte.valueOf(bArr5[3]), java.lang.Byte.valueOf(bArr5[4]), java.lang.Byte.valueOf(bArr5[5]), java.lang.Byte.valueOf(bArr5[6]));
                    }
                }
            } else if (intValue == 0) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(405, bArr, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, y-device close agc.");
            } else {
                int i29 = cVar.f447590a0;
                if (i29 != 1 && i29 != 2) {
                    int i37 = cVar.O;
                    if (i37 > -1) {
                        byte[] bArr6 = new byte[8];
                        byte[] bArr7 = new byte[2];
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, set agc1 by mAudioInfo, target:%d, gain:%d, spkgain:%d", java.lang.Integer.valueOf(cVar.P), java.lang.Integer.valueOf(cVar.Q), java.lang.Integer.valueOf(cVar.T));
                        int i38 = cVar.P;
                        if (i38 > -1 && (i18 = cVar.Q) > -1) {
                            bArr7[0] = (byte) i38;
                            bArr7[1] = (byte) i18;
                            if (cVar.R > -1) {
                                bArr6[0] = (byte) cVar.O;
                                byte b18 = (byte) i18;
                                bArr6[1] = b18;
                                bArr6[2] = b18;
                                bArr6[3] = b18;
                                bArr6[4] = (byte) i38;
                                bArr6[5] = (byte) cVar.Y;
                                bArr6[6] = (byte) cVar.Z;
                                bArr6[7] = (byte) cVar.S;
                                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(404, bArr6, 8);
                            } else {
                                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(404, bArr7, 2);
                            }
                        } else if (i38 > -1 && (i17 = cVar.T) > -1) {
                            bArr6[0] = (byte) cVar.O;
                            bArr6[1] = (byte) i17;
                            bArr6[2] = (byte) cVar.U;
                            bArr6[3] = (byte) cVar.V;
                            bArr6[4] = (byte) i38;
                            bArr6[5] = (byte) cVar.Y;
                            bArr6[6] = (byte) cVar.Z;
                            bArr6[7] = (byte) cVar.S;
                            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(404, bArr6, 8);
                        }
                    } else if (i37 == -2) {
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(405, bArr, 1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, close agc1");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, use default agc in engine.");
                    }
                }
                byte[] bArr8 = new byte[11];
                byte b19 = (byte) i29;
                bArr8[0] = b19;
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, set agc2 by mAudioInfo, device_paras[0]:%d", java.lang.Byte.valueOf(b19));
                byte b27 = bArr8[0];
                if (b27 == 1) {
                    bArr8[1] = (byte) cVar.f447604h0;
                    bArr8[2] = (byte) cVar.f447606i0;
                    bArr8[3] = (byte) cVar.f447608j0;
                    bArr8[4] = (byte) cVar.f447598e0;
                    bArr8[5] = (byte) cVar.f447600f0;
                    bArr8[6] = (byte) cVar.f447602g0;
                    bArr8[7] = (byte) cVar.f447610k0;
                    bArr8[8] = (byte) cVar.f447592b0;
                    bArr8[9] = (byte) cVar.f447594c0;
                    bArr8[10] = (byte) cVar.f447596d0;
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(461, bArr8, 11);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc2 paras: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr8[1]), java.lang.Byte.valueOf(bArr8[2]), java.lang.Byte.valueOf(bArr8[3]), java.lang.Byte.valueOf(bArr8[4]), java.lang.Byte.valueOf(bArr8[5]), java.lang.Byte.valueOf(bArr8[6]), java.lang.Byte.valueOf(bArr8[7]), java.lang.Byte.valueOf(bArr8[8]), java.lang.Byte.valueOf(bArr8[9]), java.lang.Byte.valueOf(bArr8[10]));
                } else if (b27 == 2) {
                    bArr8[1] = (byte) cVar.f447592b0;
                    bArr8[2] = (byte) cVar.f447594c0;
                    bArr8[3] = (byte) cVar.f447596d0;
                    bArr8[4] = (byte) cVar.f447598e0;
                    bArr8[5] = (byte) cVar.f447600f0;
                    bArr8[6] = (byte) cVar.f447602g0;
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(461, bArr8, 7);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc2 paras: %d, %d, %d, %d, %d, %d", java.lang.Byte.valueOf(bArr8[1]), java.lang.Byte.valueOf(bArr8[2]), java.lang.Byte.valueOf(bArr8[3]), java.lang.Byte.valueOf(bArr8[4]), java.lang.Byte.valueOf(bArr8[5]), java.lang.Byte.valueOf(bArr8[6]));
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkAudioCompatHelper", "y-expt json agc_device_params failed" + e17);
        }
        int g17 = vq4.d0.g("ladder_cpu");
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, nLadderCPU:%d", java.lang.Integer.valueOf(g17));
        if (g17 >= 0) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(97, new byte[]{(byte) (g17 & 255), (byte) ((g17 >> 8) & 255), (byte) ((g17 >> 16) & 255), (byte) ((g17 >> 24) & 255)}, 1);
        }
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multiparty_rnn_value, 1002);
        if (Ni3 > 0) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(408, new byte[]{(byte) (Ni3 & 255), (byte) ((Ni3 >> 8) & 255), (byte) ((Ni3 >> 16) & 255), (byte) ((Ni3 >> 24) & 255)}, 4);
        } else if (Ni3 == 0) {
            bArr[0] = (byte) (Ni3 & 255);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(409, bArr, 1);
        }
        wo.c cVar2 = wo.v1.f447823c;
        int i39 = cVar2.M;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang SrvDeviceInfo.mAudioInfo.nsModeNewMulti %d", java.lang.Integer.valueOf(i39));
        int i47 = cVar2.M;
        if (i47 > -1) {
            if (i39 > 0) {
                int floor = ((int) java.lang.Math.floor(i39 / 1000.0d)) % 100;
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang SrvDeviceInfo.mAudioInfo.iflag %d", java.lang.Integer.valueOf(floor));
                if (floor > 0) {
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(408, new byte[]{(byte) (i39 & 255), (byte) ((i39 >> 8) & 255), (byte) ((i39 >> 16) & 255), (byte) ((i39 >> 24) & 255)}, 4);
                }
            } else if (i39 == 0) {
                bArr[0] = (byte) (i39 & 255);
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(409, bArr, 1);
            }
        } else if (i47 == -2) {
            bArr[0] = (byte) (i39 & 255);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(409, bArr, 1);
        }
        short[] sArr = cVar2.f447620p0;
        short s17 = sArr[0];
        if (s17 > 0 || sArr[1] > 0) {
            bArr2[0] = 0;
            bArr2[1] = 0;
            if (s17 > 0 && s17 < 10000) {
                bArr2[0] = (byte) s17;
            }
            short s18 = sArr[1];
            if (s18 > 0 && s18 < 10000) {
                bArr2[1] = (byte) s18;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetNgStrength, bArr2, 2);
        }
        int i48 = cVar2.f447611l;
        if (i48 > -1 || cVar2.f447615n > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i48 > -1) {
                bArr2[0] = (byte) i48;
            }
            int i49 = cVar2.f447615n;
            if (i49 > -1) {
                bArr2[1] = (byte) i49;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(414, bArr2, 2);
        }
        int i57 = cVar2.f447613m;
        if (i57 > -1 || cVar2.f447617o > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i57 > -1) {
                bArr2[0] = (byte) i57;
            }
            int i58 = cVar2.f447617o;
            if (i58 > -1) {
                bArr2[1] = (byte) i58;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodOutputVolumeScaleEnable, bArr2, 2);
        }
        int i59 = cVar2.f447619p;
        if (i59 > -1 || cVar2.f447621q > -1) {
            bArr2[0] = -1;
            bArr2[1] = -1;
            if (i59 > -1) {
                bArr2[0] = (byte) i59;
            }
            int i66 = cVar2.f447621q;
            if (i66 > -1) {
                bArr2[1] = (byte) i66;
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodOutputVolumeGainEnable, bArr2, 2);
        }
        int i67 = cVar2.f447631v;
        if (i67 > -1) {
            bArr2[0] = (byte) i67;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC, bArr2, 1);
        }
        int i68 = cVar2.f447633w;
        if (i68 > -1 && i68 != 5) {
            bArr2[0] = (byte) i68;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(417, bArr2, 1);
        }
        int i69 = cVar2.f447635x;
        if (i69 > -1 && i69 != 5) {
            bArr2[0] = (byte) i69;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(418, bArr2, 1);
        }
        int i76 = cVar2.f447637y;
        if (i76 > -1) {
            bArr2[0] = (byte) i76;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(419, bArr2, 1);
        }
        boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
        int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
        int Ni4 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni4));
        if (bj6) {
            byte[] bArr9 = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni4 & 255), (byte) ((Ni4 >> 8) & 255), (byte) ((Ni4 >> 16) & 255), (byte) ((Ni4 >> 24) & 255)};
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX, bArr9, 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "WaveHAid, params:%d,%d,%d,%d, len:%d", java.lang.Byte.valueOf(bArr9[0]), java.lang.Byte.valueOf(bArr9[1]), java.lang.Byte.valueOf(bArr9[2]), java.lang.Byte.valueOf(bArr9[3]), 8);
        }
        if (1 == cVar2.f447616n0) {
            byte[] bArr10 = new byte[30];
            for (int i77 = 0; i77 < 15; i77++) {
                int i78 = i77 * 2;
                short s19 = wo.v1.f447823c.f447618o0[i77];
                bArr10[i78] = (byte) (s19 & 255);
                bArr10[i78 + 1] = (byte) ((s19 >> 8) & 255);
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn, bArr10, 30);
        }
        wo.c cVar3 = wo.v1.f447823c;
        if (cVar3.f447616n0 == 0) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff, bArr, 1);
        }
        int i79 = cVar3.f447622q0;
        if (i79 > 0) {
            bArr2[0] = (byte) i79;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetSpkEnhance, bArr2, 1);
        }
        int i86 = cVar3.f447639z;
        if (i86 > 0) {
            bArr2[0] = (byte) i86;
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(431, bArr2, 4);
        }
        int Ni5 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mt_agcrx_params, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, x_agcrx_paras: %d", java.lang.Integer.valueOf(Ni5));
        if (Ni5 > 0) {
            byte b28 = (byte) (Ni5 & 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agcrx_switch: %d", java.lang.Byte.valueOf(b28));
            if (b28 > 0) {
                byte[] bArr11 = {(byte) ((Ni5 >> 1) & 3), (byte) ((Ni5 >> 3) & 31), (byte) ((Ni5 >> 8) & 31), (byte) ((Ni5 >> 13) & 1)};
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, bArr11, 4);
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, agc rx para: %d, %d, %d, %d", java.lang.Byte.valueOf(bArr11[0]), java.lang.Byte.valueOf(bArr11[1]), java.lang.Byte.valueOf(bArr11[2]), java.lang.Byte.valueOf(bArr11[3]));
            }
        }
        int i87 = cVar3.f447638y0;
        if (i87 > -1) {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE.E(com.tencent.wxmm.v2helper.EMethodSetAgcRxOn, new byte[]{(byte) i87, (byte) cVar3.f447640z0, (byte) cVar3.A0, (byte) cVar3.B0}, 4);
        }
        int Ni6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_play_fadeinfadeout_switch, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_play_fadeinfadeout_switch = %d", java.lang.Integer.valueOf(Ni6));
        byte[] bArr12 = {0};
        if (Ni6 > 0) {
            bArr12[0] = (byte) Ni6;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.E(451, bArr12, 1);
        int Ni7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_play_fadeinfadeout_thresh, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_play_fadeinfadeout_thresh = %d", java.lang.Integer.valueOf(Ni7));
        bArr12[0] = 0;
        if (Ni7 > 0) {
            bArr12[0] = (byte) Ni7;
        }
        i4Var.E(452, bArr12, 1);
        long[] jArr = {((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_activerangecnt, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange1, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange2, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange3, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange4, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange5, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange6, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange7, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange8, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange9, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange10, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange11, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange12, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange13, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange14, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange15, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange16, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange17, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange18, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange19, -1L), ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_multi_lossrange20, -1L)};
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(be1.r0.CTRL_INDEX).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        order.asLongBuffer().put(jArr);
        byte[] array = order.array();
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, multi_loss_control[0] %d,multi_loss_control[1] %d multi_loss_control[2] %d", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
        i4Var.E(453, array, array.length);
        int Ni8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_rcnnvadctr, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "kerrizhang, rcnnvad_switch = %d", java.lang.Integer.valueOf(Ni8));
        if (Ni8 > 0) {
            i4Var.E(nd1.t0.CTRL_INDEX, new byte[]{(byte) Ni8}, 1);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
        com.tencent.mm.plugin.voip.model.s1.f176798a.b(sb6);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "get ModelRoot: " + sb6.toString());
        i4Var.E(com.tencent.mm.plugin.appbrand.jsapi.lbs.h.CTRL_INDEX, sb6.toString().getBytes(), sb6.toString().length());
        int Ni9 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_frz_sta_peroid, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, iLink updateAudioAdaption, frz_sta_p_x = %d", java.lang.Integer.valueOf(Ni9));
        if (Ni9 > 0) {
            i4Var.E(com.tencent.mm.plugin.appbrand.jsapi.share.r1.CTRL_INDEX, new byte[]{(byte) (Ni9 & 255), (byte) ((Ni9 >> 8) & 255), (byte) ((Ni9 >> 16) & 255), (byte) ((Ni9 >> 24) & 255)}, 4);
        }
        int Ni10 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_new_net_state_tips, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, net_state_xexpt = %d", java.lang.Integer.valueOf(Ni10));
        byte[] bArr13 = {0};
        if (Ni10 == 1) {
            bArr13[0] = 1;
        }
        i4Var.E(lf1.d.CTRL_INDEX, bArr13, 1);
        int Ni11 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_mt_play_volume_factor, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, play_vol = %d", java.lang.Integer.valueOf(Ni11));
        byte[] bArr14 = {0};
        if (Ni11 > 0 && Ni11 < 20) {
            bArr14[0] = (byte) Ni11;
            i4Var.E(wc1.p.CTRL_INDEX, bArr14, 1);
        }
        int i88 = cVar3.X;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, SrvDeviceInfo.mAudioInfo.playVolMT: %d", java.lang.Integer.valueOf(i88));
        if (i88 > 0 && i88 < 20) {
            bArr14[0] = (byte) i88;
            i4Var.E(wc1.p.CTRL_INDEX, bArr14, 1);
        }
        int Ni12 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_engine_get_data_config, -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkAudioCompatHelper", "qipengfeng, updateAudioAdaption, switch_flag_x = %d", java.lang.Integer.valueOf(Ni12));
        byte[] bArr15 = {0};
        if (Ni12 > 0) {
            bArr15[0] = 1;
        }
        i4Var.E(450, bArr15, 1);
    }
}
