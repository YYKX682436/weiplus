package wo5;

/* loaded from: classes16.dex */
public final class a {
    public final boolean a(byte[] b17) {
        kotlin.jvm.internal.o.g(b17, "b");
        wo5.f fVar = new wo5.f(new java.io.ByteArrayInputStream(b17));
        fVar.e(8);
        fVar.e(8);
        fVar.e(8);
        fVar.e(8);
        fVar.e(8);
        long c17 = fVar.c(8);
        java.lang.String.valueOf(c17);
        int i17 = (int) c17;
        if (i17 == 66) {
            return false;
        }
        fVar.e(8);
        fVar.g("SPS: seq_parameter_set_id");
        if (i17 == 100 || i17 == 110 || i17 == 122 || i17 == 144) {
            if (fVar.d("SPS: chroma_format_idc") == 3) {
                fVar.e(1);
            }
            fVar.g("SPS: bit_depth_luma_minus8");
            fVar.g("SPS: bit_depth_chroma_minus8");
            fVar.e(1);
            if (fVar.b("SPS: seq_scaling_matrix_present_lag")) {
                for (int i18 = 0; i18 < 8; i18++) {
                    if (fVar.b("SPS: seqScalingListPresentFlag")) {
                        if (i18 < 6) {
                            fVar.f(16);
                        } else {
                            fVar.f(64);
                        }
                    }
                }
            }
        }
        fVar.g("SPS: log2_max_frame_num_minus4");
        int d17 = fVar.d("SPS: pic_order_cnt_type");
        if (d17 == 0) {
            fVar.g("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (d17 == 1) {
            fVar.e(1);
            fVar.g("SPS: offset_for_non_ref_pic");
            fVar.g("SPS: offset_for_top_to_bottom_field");
            int d18 = fVar.d("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            for (int i19 = 0; i19 < d18; i19++) {
                fVar.g("SPS: offsetForRefFrame [" + i19 + ']');
            }
        }
        fVar.d("SPS: num_ref_frames");
        fVar.e(1);
        fVar.g("SPS: pic_width_in_mbs_minus1");
        fVar.g("SPS: pic_height_in_map_units_minus1");
        if (!fVar.b("SPS: frame_mbs_only_flag")) {
            fVar.e(1);
        }
        fVar.e(1);
        if (fVar.b("SPS: frame_cropping_flag")) {
            fVar.g("SPS: frame_crop_left_offset");
            fVar.g("SPS: frame_crop_right_offset");
            fVar.g("SPS: frame_crop_top_offset");
            fVar.g("SPS: frame_crop_bottom_offset");
        }
        if (!fVar.b("SPS: vui_parameters_present_flag")) {
            return false;
        }
        if (fVar.b("VUI: aspect_ratio_info_present_flag")) {
            long c18 = fVar.c(8);
            java.lang.String.valueOf(c18);
            if (((int) c18) == 255) {
                fVar.e(16);
                fVar.e(16);
            }
        }
        if (fVar.b("VUI: overscan_info_present_flag")) {
            fVar.e(1);
        }
        if (fVar.b("VUI: video_signal_type_present_flag")) {
            fVar.e(3);
            fVar.e(1);
            if (fVar.b("VUI: colour_description_present_flag")) {
                fVar.e(8);
                fVar.e(8);
                fVar.e(8);
            }
        }
        if (fVar.b("VUI: chroma_loc_info_present_flag")) {
            fVar.g("VUI chroma_sample_loc_type_top_field");
            fVar.g("VUI chroma_sample_loc_type_bottom_field");
        }
        if (fVar.b("VUI: timing_info_present_flag")) {
            fVar.e(32);
            fVar.e(32);
            fVar.e(1);
        }
        boolean b18 = fVar.b("VUI: nal_hrd_parameters_present_flag");
        if (b18) {
            b(fVar);
        }
        boolean b19 = fVar.b("VUI: vcl_hrd_parameters_present_flag");
        if (b19) {
            b(fVar);
        }
        if (b18 || b19) {
            fVar.e(1);
        }
        fVar.e(1);
        if (!fVar.b("VUI: bitstream_restriction_flag")) {
            return false;
        }
        fVar.b("VUI: motion_vectors_over_pic_boundaries_flag");
        fVar.g("VUI max_bytes_per_pic_denom");
        fVar.g("VUI max_bits_per_mb_denom");
        fVar.g("VUI log2_max_mv_length_horizontal");
        fVar.g("VUI log2_max_mv_length_vertical");
        int d19 = fVar.d("VUI num_reorder_frames");
        fVar.d("VUI: max_dec_frame_buffering");
        return d19 != 0;
    }

    public final void b(wo5.f fVar) {
        int d17 = fVar.d("SPS: cpb_cnt_minus1");
        fVar.e(4);
        fVar.e(4);
        if (d17 >= 0) {
            int i17 = 0;
            while (true) {
                fVar.g("HRD: bit_rate_value_minus1");
                fVar.g("HRD: cpb_size_value_minus1");
                fVar.e(1);
                if (i17 == d17) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        fVar.e(5);
        fVar.e(5);
        fVar.e(5);
        fVar.e(5);
    }
}
