package com.tencent.pigeon.biz_base;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/biz_base/BizBaseApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class BizBaseApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.biz_base.BizBaseApiCodec INSTANCE = new com.tencent.pigeon.biz_base.BizBaseApiCodec();

    private BizBaseApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.biz_base.BizArticleInfo.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object readValue2 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
            if (list2 != null) {
                return com.tencent.pigeon.biz_base.BizChattingJumpInfo.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object readValue3 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list3 = readValue3 instanceof java.util.List ? (java.util.List) readValue3 : null;
            if (list3 != null) {
                return com.tencent.pigeon.biz_base.BizEnterStatusInfo.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -125) {
            java.lang.Object readValue4 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list4 = readValue4 instanceof java.util.List ? (java.util.List) readValue4 : null;
            if (list4 != null) {
                return com.tencent.pigeon.biz_base.BizFinderJumpInfo.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -124) {
            java.lang.Object readValue5 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list5 = readValue5 instanceof java.util.List ? (java.util.List) readValue5 : null;
            if (list5 != null) {
                return com.tencent.pigeon.biz_base.BizFinderLiveInfo.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -123) {
            java.lang.Object readValue6 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list6 = readValue6 instanceof java.util.List ? (java.util.List) readValue6 : null;
            if (list6 != null) {
                return com.tencent.pigeon.biz_base.BizFinderLiveStats.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -122) {
            java.lang.Object readValue7 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list7 = readValue7 instanceof java.util.List ? (java.util.List) readValue7 : null;
            if (list7 != null) {
                return com.tencent.pigeon.biz_base.BizFinderPigeonInfo.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -121) {
            java.lang.Object readValue8 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list8 = readValue8 instanceof java.util.List ? (java.util.List) readValue8 : null;
            if (list8 != null) {
                return com.tencent.pigeon.biz_base.BizMinimizeInfo.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type == -120) {
            java.lang.Object readValue9 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list9 = readValue9 instanceof java.util.List ? (java.util.List) readValue9 : null;
            if (list9 != null) {
                return com.tencent.pigeon.biz_base.BizNotifyTipsInfo.INSTANCE.fromList(list9);
            }
            return null;
        }
        if (type == -119) {
            java.lang.Object readValue10 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list10 = readValue10 instanceof java.util.List ? (java.util.List) readValue10 : null;
            if (list10 != null) {
                return com.tencent.pigeon.biz_base.BizProfileJumpInfo.INSTANCE.fromList(list10);
            }
            return null;
        }
        if (type == -118) {
            java.lang.Object readValue11 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list11 = readValue11 instanceof java.util.List ? (java.util.List) readValue11 : null;
            if (list11 != null) {
                return com.tencent.pigeon.biz_base.BizRecFollowActionInfo.INSTANCE.fromList(list11);
            }
            return null;
        }
        if (type == -117) {
            java.lang.Object readValue12 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list12 = readValue12 instanceof java.util.List ? (java.util.List) readValue12 : null;
            if (list12 != null) {
                return com.tencent.pigeon.biz_base.BizRect.INSTANCE.fromList(list12);
            }
            return null;
        }
        if (type == -116) {
            java.lang.Object readValue13 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list13 = readValue13 instanceof java.util.List ? (java.util.List) readValue13 : null;
            if (list13 != null) {
                return com.tencent.pigeon.biz_base.ContactInfo.INSTANCE.fromList(list13);
            }
            return null;
        }
        if (type == -115) {
            java.lang.Object readValue14 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list14 = readValue14 instanceof java.util.List ? (java.util.List) readValue14 : null;
            if (list14 != null) {
                return com.tencent.pigeon.biz_base.ContactInfo.INSTANCE.fromList(list14);
            }
            return null;
        }
        if (type == -114) {
            java.lang.Object readValue15 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list15 = readValue15 instanceof java.util.List ? (java.util.List) readValue15 : null;
            if (list15 != null) {
                return com.tencent.pigeon.biz_base.FinderPageJumpInfo.INSTANCE.fromList(list15);
            }
            return null;
        }
        if (type == -113) {
            java.lang.Object readValue16 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list16 = readValue16 instanceof java.util.List ? (java.util.List) readValue16 : null;
            if (list16 != null) {
                return com.tencent.pigeon.biz_base.Finder_Data.INSTANCE.fromList(list16);
            }
            return null;
        }
        if (type == -112) {
            java.lang.Object readValue17 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list17 = readValue17 instanceof java.util.List ? (java.util.List) readValue17 : null;
            if (list17 != null) {
                return com.tencent.pigeon.biz_base.MassSendCardMsg.INSTANCE.fromList(list17);
            }
            return null;
        }
        if (type == -111) {
            java.lang.Object readValue18 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list18 = readValue18 instanceof java.util.List ? (java.util.List) readValue18 : null;
            if (list18 != null) {
                return com.tencent.pigeon.biz_base.MassSendCardMsgItem.INSTANCE.fromList(list18);
            }
            return null;
        }
        if (type == -110) {
            java.lang.Object readValue19 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list19 = readValue19 instanceof java.util.List ? (java.util.List) readValue19 : null;
            if (list19 != null) {
                return com.tencent.pigeon.biz_base.MiniProgramLaunchBundle.INSTANCE.fromList(list19);
            }
            return null;
        }
        if (type == -109) {
            java.lang.Object readValue20 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list20 = readValue20 instanceof java.util.List ? (java.util.List) readValue20 : null;
            if (list20 != null) {
                return com.tencent.pigeon.biz_base.NativeBizCreationInfo.INSTANCE.fromList(list20);
            }
            return null;
        }
        if (type == -108) {
            java.lang.Object readValue21 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list21 = readValue21 instanceof java.util.List ? (java.util.List) readValue21 : null;
            if (list21 != null) {
                return com.tencent.pigeon.biz_base.NetworkInfo.INSTANCE.fromList(list21);
            }
            return null;
        }
        if (type == -107) {
            java.lang.Object readValue22 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list22 = readValue22 instanceof java.util.List ? (java.util.List) readValue22 : null;
            if (list22 != null) {
                return com.tencent.pigeon.biz_base.OftenReadAccountInfo.INSTANCE.fromList(list22);
            }
            return null;
        }
        if (type == -106) {
            java.lang.Object readValue23 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list23 = readValue23 instanceof java.util.List ? (java.util.List) readValue23 : null;
            if (list23 != null) {
                return com.tencent.pigeon.biz_base.OftenReadAccountInfo.INSTANCE.fromList(list23);
            }
            return null;
        }
        if (type == -105) {
            java.lang.Object readValue24 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list24 = readValue24 instanceof java.util.List ? (java.util.List) readValue24 : null;
            if (list24 != null) {
                return com.tencent.pigeon.biz_base.PersonalCenterJumpInfo.INSTANCE.fromList(list24);
            }
            return null;
        }
        if (type == -104) {
            java.lang.Object readValue25 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list25 = readValue25 instanceof java.util.List ? (java.util.List) readValue25 : null;
            if (list25 != null) {
                return com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo.INSTANCE.fromList(list25);
            }
            return null;
        }
        if (type == -103) {
            java.lang.Object readValue26 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list26 = readValue26 instanceof java.util.List ? (java.util.List) readValue26 : null;
            if (list26 != null) {
                return com.tencent.pigeon.biz_base.PreloadPicInfo.INSTANCE.fromList(list26);
            }
            return null;
        }
        if (type == -102) {
            java.lang.Object readValue27 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list27 = readValue27 instanceof java.util.List ? (java.util.List) readValue27 : null;
            if (list27 != null) {
                return com.tencent.pigeon.biz_base.RecycleCardPigeon.INSTANCE.fromList(list27);
            }
            return null;
        }
        if (type != -101) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue28 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list28 = readValue28 instanceof java.util.List ? (java.util.List) readValue28 : null;
        if (list28 != null) {
            return com.tencent.pigeon.biz_base.WeApp_Data.INSTANCE.fromList(list28);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.biz_base.BizArticleInfo) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizArticleInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizChattingJumpInfo) {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizChattingJumpInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizEnterStatusInfo) {
            stream.write(130);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizEnterStatusInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizFinderJumpInfo) {
            stream.write(131);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizFinderJumpInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizFinderLiveInfo) {
            stream.write(132);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizFinderLiveInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizFinderLiveStats) {
            stream.write(133);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizFinderLiveStats) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizFinderPigeonInfo) {
            stream.write(134);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizFinderPigeonInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizMinimizeInfo) {
            stream.write(135);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizMinimizeInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizNotifyTipsInfo) {
            stream.write(136);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizNotifyTipsInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizProfileJumpInfo) {
            stream.write(137);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizProfileJumpInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizRecFollowActionInfo) {
            stream.write(138);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizRecFollowActionInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.BizRect) {
            stream.write(139);
            writeValue(stream, ((com.tencent.pigeon.biz_base.BizRect) obj).toList());
            return;
        }
        boolean z17 = obj instanceof com.tencent.pigeon.biz_base.ContactInfo;
        if (z17) {
            stream.write(140);
            writeValue(stream, ((com.tencent.pigeon.biz_base.ContactInfo) obj).toList());
            return;
        }
        if (z17) {
            stream.write(141);
            writeValue(stream, ((com.tencent.pigeon.biz_base.ContactInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.FinderPageJumpInfo) {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
            writeValue(stream, ((com.tencent.pigeon.biz_base.FinderPageJumpInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.Finder_Data) {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER);
            writeValue(stream, ((com.tencent.pigeon.biz_base.Finder_Data) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.MassSendCardMsg) {
            stream.write(144);
            writeValue(stream, ((com.tencent.pigeon.biz_base.MassSendCardMsg) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.MassSendCardMsgItem) {
            stream.write(145);
            writeValue(stream, ((com.tencent.pigeon.biz_base.MassSendCardMsgItem) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.MiniProgramLaunchBundle) {
            stream.write(146);
            writeValue(stream, ((com.tencent.pigeon.biz_base.MiniProgramLaunchBundle) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.NativeBizCreationInfo) {
            stream.write(147);
            writeValue(stream, ((com.tencent.pigeon.biz_base.NativeBizCreationInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.NetworkInfo) {
            stream.write(148);
            writeValue(stream, ((com.tencent.pigeon.biz_base.NetworkInfo) obj).toList());
            return;
        }
        boolean z18 = obj instanceof com.tencent.pigeon.biz_base.OftenReadAccountInfo;
        if (z18) {
            stream.write(com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX);
            writeValue(stream, ((com.tencent.pigeon.biz_base.OftenReadAccountInfo) obj).toList());
            return;
        }
        if (z18) {
            stream.write(150);
            writeValue(stream, ((com.tencent.pigeon.biz_base.OftenReadAccountInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.PersonalCenterJumpInfo) {
            stream.write(151);
            writeValue(stream, ((com.tencent.pigeon.biz_base.PersonalCenterJumpInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo) {
            stream.write(152);
            writeValue(stream, ((com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.biz_base.PreloadPicInfo) {
            stream.write(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
            writeValue(stream, ((com.tencent.pigeon.biz_base.PreloadPicInfo) obj).toList());
        } else if (obj instanceof com.tencent.pigeon.biz_base.RecycleCardPigeon) {
            stream.write(154);
            writeValue(stream, ((com.tencent.pigeon.biz_base.RecycleCardPigeon) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.biz_base.WeApp_Data)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(155);
            writeValue(stream, ((com.tencent.pigeon.biz_base.WeApp_Data) obj).toList());
        }
    }
}
