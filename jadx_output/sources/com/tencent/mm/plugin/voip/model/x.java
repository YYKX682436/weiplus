package com.tencent.mm.plugin.voip.model;

/* loaded from: classes16.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f176912a = 0;

    public byte[] a(byte[] bArr) {
        int i17;
        boolean z17;
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.tencent.mm.plugin.voip.model.g0 g0Var = new com.tencent.mm.plugin.voip.model.g0(byteArrayInputStream, byteArrayOutputStream);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        int d17 = (int) g0Var.d(8, "SPS: profile_idc");
        g0Var.f(8);
        g0Var.d(8, "SPS: level_idc");
        g0Var.h("SPS: seq_parameter_set_id");
        if (d17 == 100 || d17 == 110 || d17 == 122 || d17 == 144) {
            if (g0Var.e("SPS: chroma_format_idc") == 3) {
                g0Var.f(1);
            }
            g0Var.h("SPS: bit_depth_luma_minus8");
            g0Var.h("SPS: bit_depth_chroma_minus8");
            g0Var.f(1);
            if (g0Var.b(true)) {
                for (int i18 = 0; i18 < 8; i18++) {
                    if (g0Var.b(true)) {
                        if (i18 < 6) {
                            g0Var.g(16);
                        } else {
                            g0Var.g(64);
                        }
                    }
                }
            }
        }
        g0Var.h("SPS: log2_max_frame_num_minus4");
        int e17 = g0Var.e("SPS: pic_order_cnt_type");
        if (e17 == 0) {
            g0Var.h("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (e17 == 1) {
            g0Var.f(1);
            g0Var.h("SPS: offset_for_non_ref_pic");
            g0Var.h("SPS: offset_for_top_to_bottom_field");
            int e18 = g0Var.e("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i19 = 0; i19 < e18; i19++) {
                g0Var.h("SPS: offsetForRefFrame [" + i19 + "]");
            }
        }
        g0Var.h("SPS: num_ref_frames");
        g0Var.f(1);
        g0Var.h("SPS: pic_width_in_mbs_minus1");
        g0Var.h("SPS: pic_height_in_map_units_minus1");
        if (!g0Var.b(true)) {
            g0Var.f(1);
        }
        g0Var.f(1);
        if (g0Var.b(true)) {
            g0Var.h("SPS: frame_crop_left_offset");
            g0Var.h("SPS: frame_crop_right_offset");
            g0Var.h("SPS: frame_crop_top_offset");
            g0Var.h("SPS: frame_crop_bottom_offset");
        }
        if (g0Var.b(false)) {
            g0Var.i(1);
            if (g0Var.b(true)) {
                if (((int) g0Var.d(8, "VUI: aspect_ratio")) == 255) {
                    g0Var.f(16);
                    g0Var.f(16);
                }
                z17 = true;
            } else {
                z17 = true;
            }
            if (g0Var.b(z17)) {
                g0Var.f(z17 ? 1 : 0);
            }
            if (g0Var.b(z17)) {
                g0Var.f(3);
                g0Var.f(z17 ? 1 : 0);
                if (g0Var.b(z17)) {
                    g0Var.f(8);
                    g0Var.f(8);
                    g0Var.f(8);
                }
            }
            if (g0Var.b(z17)) {
                g0Var.h("VUI chroma_sample_loc_type_top_field");
                g0Var.h("VUI chroma_sample_loc_type_bottom_field");
            }
            if (g0Var.b(z17)) {
                g0Var.f(32);
                g0Var.f(32);
                g0Var.f(z17 ? 1 : 0);
            }
            boolean b17 = g0Var.b(z17);
            if (b17) {
                d(g0Var);
            }
            boolean b18 = g0Var.b(z17);
            if (b18) {
                d(g0Var);
            }
            if (b17 || b18) {
                g0Var.f(z17 ? 1 : 0);
            }
            g0Var.f(z17 ? 1 : 0);
            if (g0Var.b(false)) {
                g0Var.i(z17 ? 1 : 0);
                g0Var.b(z17);
                g0Var.h("VUI max_bytes_per_pic_denom");
                g0Var.h("VUI max_bits_per_mb_denom");
                g0Var.h("VUI log2_max_mv_length_horizontal");
                g0Var.h("VUI log2_max_mv_length_vertical");
                g0Var.h("VUI num_reorder_frames");
                i17 = 1;
                g0Var.l(1, "VUI: max_dec_frame_buffering");
            } else {
                g0Var.i(z17 ? 1 : 0);
                g0Var.i(z17 ? 1 : 0);
                g0Var.l(0, "VUI: max_bytes_per_pic_denom");
                g0Var.l(0, "VUI: max_bits_per_mb_denom");
                g0Var.l(10, "VUI: log2_max_mv_length_horizontal");
                g0Var.l(10, "VUI: log2_max_mv_length_vertical");
                g0Var.l(0, "VUI: num_reorder_frames");
                g0Var.l(z17 ? 1 : 0, "VUI: max_dec_frame_buffering");
                i17 = z17;
            }
        } else {
            i17 = 1;
            g0Var.i(1);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(0);
            g0Var.i(1);
            g0Var.i(1);
            g0Var.l(0, "VUI: max_bytes_per_pic_denom");
            g0Var.l(0, "VUI: max_bits_per_mb_denom");
            g0Var.l(10, "VUI: log2_max_mv_length_horizontal");
            g0Var.l(10, "VUI: log2_max_mv_length_vertical");
            g0Var.l(0, "VUI: num_reorder_frames");
            g0Var.l(1, "VUI: max_dec_frame_buffering");
        }
        g0Var.i(i17);
        g0Var.k(0L, 8 - g0Var.f176506g);
        for (int i27 = g0Var.f176506g; i27 < 8; i27++) {
            g0Var.f176505f[i27] = 0;
        }
        g0Var.f176506g = 0;
        g0Var.j();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        java.lang.String str = "";
        for (byte b19 : byteArray) {
            java.lang.String hexString = java.lang.Integer.toHexString(b19 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            str = str + " " + hexString;
        }
        return byteArray;
    }

    public boolean b(byte[] bArr) {
        com.tencent.mm.plugin.voip.model.g0 g0Var = new com.tencent.mm.plugin.voip.model.g0(new java.io.ByteArrayInputStream(bArr));
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        int d17 = (int) g0Var.d(8, "SPS: profile_idc");
        if (d17 == 66) {
            this.f176912a |= 1;
        } else {
            g0Var.f(8);
            g0Var.d(8, "SPS: level_idc");
            g0Var.h("SPS: seq_parameter_set_id");
            if (d17 == 100 || d17 == 110 || d17 == 122 || d17 == 144) {
                if (g0Var.e("SPS: chroma_format_idc") == 3) {
                    g0Var.f(1);
                }
                g0Var.h("SPS: bit_depth_luma_minus8");
                g0Var.h("SPS: bit_depth_chroma_minus8");
                g0Var.f(1);
                if (g0Var.b(true)) {
                    for (int i17 = 0; i17 < 8; i17++) {
                        if (g0Var.b(true)) {
                            if (i17 < 6) {
                                g0Var.g(16);
                            } else {
                                g0Var.g(64);
                            }
                        }
                    }
                }
            }
            g0Var.h("SPS: log2_max_frame_num_minus4");
            int e17 = g0Var.e("SPS: pic_order_cnt_type");
            if (e17 == 0) {
                g0Var.h("SPS: log2_max_pic_order_cnt_lsb_minus4");
            } else if (e17 == 1) {
                g0Var.f(1);
                g0Var.h("SPS: offset_for_non_ref_pic");
                g0Var.h("SPS: offset_for_top_to_bottom_field");
                int e18 = g0Var.e("SPS: num_ref_frames_in_pic_order_cnt_cycle");
                for (int i18 = 0; i18 < e18; i18++) {
                    g0Var.h("SPS: offsetForRefFrame [" + i18 + "]");
                }
            }
            if (g0Var.e("SPS: num_ref_frames") >= 2) {
                this.f176912a |= 2;
            }
            g0Var.f(1);
            g0Var.h("SPS: pic_width_in_mbs_minus1");
            g0Var.h("SPS: pic_height_in_map_units_minus1");
            if (!g0Var.b(true)) {
                g0Var.f(1);
            }
            g0Var.f(1);
            if (g0Var.b(true)) {
                g0Var.h("SPS: frame_crop_left_offset");
                g0Var.h("SPS: frame_crop_right_offset");
                g0Var.h("SPS: frame_crop_top_offset");
                g0Var.h("SPS: frame_crop_bottom_offset");
            }
            if (g0Var.b(true)) {
                if (g0Var.b(true) && ((int) g0Var.d(8, "VUI: aspect_ratio")) == 255) {
                    g0Var.f(16);
                    g0Var.f(16);
                }
                if (g0Var.b(true)) {
                    g0Var.f(1);
                }
                if (g0Var.b(true)) {
                    g0Var.f(3);
                    g0Var.f(1);
                    if (g0Var.b(true)) {
                        g0Var.f(8);
                        g0Var.f(8);
                        g0Var.f(8);
                    }
                }
                if (g0Var.b(true)) {
                    g0Var.h("VUI chroma_sample_loc_type_top_field");
                    g0Var.h("VUI chroma_sample_loc_type_bottom_field");
                }
                if (g0Var.b(true)) {
                    g0Var.f(32);
                    g0Var.f(32);
                    g0Var.f(1);
                }
                boolean b17 = g0Var.b(true);
                if (b17) {
                    d(g0Var);
                }
                boolean b18 = g0Var.b(true);
                if (b18) {
                    d(g0Var);
                }
                if (b17 || b18) {
                    g0Var.f(1);
                }
                g0Var.f(1);
                if (g0Var.b(true)) {
                    g0Var.b(true);
                    g0Var.h("VUI max_bytes_per_pic_denom");
                    g0Var.h("VUI max_bits_per_mb_denom");
                    g0Var.h("VUI log2_max_mv_length_horizontal");
                    g0Var.h("VUI log2_max_mv_length_vertical");
                    int e19 = g0Var.e("VUI num_reorder_frames");
                    g0Var.e("VUI: max_dec_frame_buffering");
                    if (e19 != 0) {
                        this.f176912a |= 4;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean c(byte[] bArr) {
        com.tencent.mm.plugin.voip.model.g0 g0Var = new com.tencent.mm.plugin.voip.model.g0(new java.io.ByteArrayInputStream(bArr));
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.f(8);
        g0Var.h("Slice: first_mb_in_slice");
        int e17 = g0Var.e("Slice: slice_type");
        if (e17 != 1 && e17 != 6) {
            return false;
        }
        this.f176912a |= 8;
        return true;
    }

    public final void d(com.tencent.mm.plugin.voip.model.g0 g0Var) {
        int e17 = g0Var.e("SPS: cpb_cnt_minus1");
        g0Var.f(4);
        g0Var.f(4);
        for (int i17 = 0; i17 <= e17; i17++) {
            g0Var.h("HRD: bit_rate_value_minus1");
            g0Var.h("HRD: cpb_size_value_minus1");
            g0Var.f(1);
        }
        g0Var.f(5);
        g0Var.f(5);
        g0Var.f(5);
        g0Var.f(5);
    }
}
