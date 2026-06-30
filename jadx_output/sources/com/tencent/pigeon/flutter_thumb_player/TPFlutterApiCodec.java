package com.tencent.pigeon.flutter_thumb_player;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/flutter_thumb_player/TPFlutterApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class TPFlutterApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.flutter_thumb_player.TPFlutterApiCodec INSTANCE = new com.tencent.pigeon.flutter_thumb_player.TPFlutterApiCodec();

    private TPFlutterApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object readValue2 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
            if (list2 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerContext.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object readValue3 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list3 = readValue3 instanceof java.util.List ? (java.util.List) readValue3 : null;
            if (list3 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerInitParams.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -125) {
            java.lang.Object readValue4 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list4 = readValue4 instanceof java.util.List ? (java.util.List) readValue4 : null;
            if (list4 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -124) {
            java.lang.Object readValue5 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list5 = readValue5 instanceof java.util.List ? (java.util.List) readValue5 : null;
            if (list5 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerRange.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -123) {
            java.lang.Object readValue6 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list6 = readValue6 instanceof java.util.List ? (java.util.List) readValue6 : null;
            if (list6 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -122) {
            java.lang.Object readValue7 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list7 = readValue7 instanceof java.util.List ? (java.util.List) readValue7 : null;
            if (list7 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -121) {
            java.lang.Object readValue8 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list8 = readValue8 instanceof java.util.List ? (java.util.List) readValue8 : null;
            if (list8 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type == -120) {
            java.lang.Object readValue9 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list9 = readValue9 instanceof java.util.List ? (java.util.List) readValue9 : null;
            if (list9 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetLoopParams.INSTANCE.fromList(list9);
            }
            return null;
        }
        if (type == -119) {
            java.lang.Object readValue10 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list10 = readValue10 instanceof java.util.List ? (java.util.List) readValue10 : null;
            if (list10 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaInfoParams.INSTANCE.fromList(list10);
            }
            return null;
        }
        if (type == -118) {
            java.lang.Object readValue11 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list11 = readValue11 instanceof java.util.List ? (java.util.List) readValue11 : null;
            if (list11 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams.INSTANCE.fromList(list11);
            }
            return null;
        }
        if (type == -117) {
            java.lang.Object readValue12 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list12 = readValue12 instanceof java.util.List ? (java.util.List) readValue12 : null;
            if (list12 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams.INSTANCE.fromList(list12);
            }
            return null;
        }
        if (type == -116) {
            java.lang.Object readValue13 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list13 = readValue13 instanceof java.util.List ? (java.util.List) readValue13 : null;
            if (list13 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetPlayRangeParams.INSTANCE.fromList(list13);
            }
            return null;
        }
        if (type == -115) {
            java.lang.Object readValue14 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list14 = readValue14 instanceof java.util.List ? (java.util.List) readValue14 : null;
            if (list14 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams.INSTANCE.fromList(list14);
            }
            return null;
        }
        if (type == -114) {
            java.lang.Object readValue15 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list15 = readValue15 instanceof java.util.List ? (java.util.List) readValue15 : null;
            if (list15 != null) {
                return com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams.INSTANCE.fromList(list15);
            }
            return null;
        }
        if (type != -113) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue16 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list16 = readValue16 instanceof java.util.List ? (java.util.List) readValue16 : null;
        if (list16 != null) {
            return com.tencent.pigeon.flutter_thumb_player.TPVideoSizeRet.INSTANCE.fromList(list16);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerContext) {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerContext) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerInitParams) {
            stream.write(130);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerInitParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams) {
            stream.write(131);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerRange) {
            stream.write(132);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerRange) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect) {
            stream.write(133);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams) {
            stream.write(134);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams) {
            stream.write(135);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetLoopParams) {
            stream.write(136);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetLoopParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaInfoParams) {
            stream.write(137);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaInfoParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams) {
            stream.write(138);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams) {
            stream.write(139);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetPlayRangeParams) {
            stream.write(140);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetPlayRangeParams) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams) {
            stream.write(141);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams) obj).toList());
        } else if (obj instanceof com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams) {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.flutter_thumb_player.TPVideoSizeRet)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER);
            writeValue(stream, ((com.tencent.pigeon.flutter_thumb_player.TPVideoSizeRet) obj).toList());
        }
    }
}
