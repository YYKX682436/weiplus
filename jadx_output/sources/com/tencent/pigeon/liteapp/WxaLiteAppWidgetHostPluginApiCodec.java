package com.tencent.pigeon.liteapp;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000f"}, d2 = {"Lcom/tencent/pigeon/liteapp/WxaLiteAppWidgetHostPluginApiCodec;", "Lio/flutter/plugin/common/StandardMessageCodec;", "", "type", "Ljava/nio/ByteBuffer;", "buffer", "", "readValueOfType", "Ljava/io/ByteArrayOutputStream;", "stream", "value", "Ljz5/f0;", "writeValue", "<init>", "()V", "wxa_lite_app_widget_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class WxaLiteAppWidgetHostPluginApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
    public static final com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApiCodec INSTANCE = new com.tencent.pigeon.liteapp.WxaLiteAppWidgetHostPluginApiCodec();

    private WxaLiteAppWidgetHostPluginApiCodec() {
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public java.lang.Object readValueOfType(byte type, java.nio.ByteBuffer buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (type == Byte.MIN_VALUE) {
            java.lang.Object readValue = readValue(buffer);
            java.util.List<? extends java.lang.Object> list = readValue instanceof java.util.List ? (java.util.List) readValue : null;
            if (list != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage.INSTANCE.fromList(list);
            }
            return null;
        }
        if (type == -127) {
            java.lang.Object readValue2 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list2 = readValue2 instanceof java.util.List ? (java.util.List) readValue2 : null;
            if (list2 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage.INSTANCE.fromList(list2);
            }
            return null;
        }
        if (type == -126) {
            java.lang.Object readValue3 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list3 = readValue3 instanceof java.util.List ? (java.util.List) readValue3 : null;
            if (list3 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage.INSTANCE.fromList(list3);
            }
            return null;
        }
        if (type == -125) {
            java.lang.Object readValue4 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list4 = readValue4 instanceof java.util.List ? (java.util.List) readValue4 : null;
            if (list4 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage.INSTANCE.fromList(list4);
            }
            return null;
        }
        if (type == -124) {
            java.lang.Object readValue5 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list5 = readValue5 instanceof java.util.List ? (java.util.List) readValue5 : null;
            if (list5 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage.INSTANCE.fromList(list5);
            }
            return null;
        }
        if (type == -123) {
            java.lang.Object readValue6 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list6 = readValue6 instanceof java.util.List ? (java.util.List) readValue6 : null;
            if (list6 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage.INSTANCE.fromList(list6);
            }
            return null;
        }
        if (type == -122) {
            java.lang.Object readValue7 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list7 = readValue7 instanceof java.util.List ? (java.util.List) readValue7 : null;
            if (list7 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidMessage.INSTANCE.fromList(list7);
            }
            return null;
        }
        if (type == -121) {
            java.lang.Object readValue8 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list8 = readValue8 instanceof java.util.List ? (java.util.List) readValue8 : null;
            if (list8 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage.INSTANCE.fromList(list8);
            }
            return null;
        }
        if (type == -120) {
            java.lang.Object readValue9 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list9 = readValue9 instanceof java.util.List ? (java.util.List) readValue9 : null;
            if (list9 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventMessage.INSTANCE.fromList(list9);
            }
            return null;
        }
        if (type == -119) {
            java.lang.Object readValue10 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list10 = readValue10 instanceof java.util.List ? (java.util.List) readValue10 : null;
            if (list10 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllByAppIdMessage.INSTANCE.fromList(list10);
            }
            return null;
        }
        if (type == -118) {
            java.lang.Object readValue11 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list11 = readValue11 instanceof java.util.List ? (java.util.List) readValue11 : null;
            if (list11 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllMessage.INSTANCE.fromList(list11);
            }
            return null;
        }
        if (type == -117) {
            java.lang.Object readValue12 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list12 = readValue12 instanceof java.util.List ? (java.util.List) readValue12 : null;
            if (list12 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToTopPageMessage.INSTANCE.fromList(list12);
            }
            return null;
        }
        if (type == -116) {
            java.lang.Object readValue13 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list13 = readValue13 instanceof java.util.List ? (java.util.List) readValue13 : null;
            if (list13 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage.INSTANCE.fromList(list13);
            }
            return null;
        }
        if (type == -115) {
            java.lang.Object readValue14 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list14 = readValue14 instanceof java.util.List ? (java.util.List) readValue14 : null;
            if (list14 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetShowViewMessage.INSTANCE.fromList(list14);
            }
            return null;
        }
        if (type == -114) {
            java.lang.Object readValue15 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list15 = readValue15 instanceof java.util.List ? (java.util.List) readValue15 : null;
            if (list15 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetStoreIsAliveMessage.INSTANCE.fromList(list15);
            }
            return null;
        }
        if (type == -113) {
            java.lang.Object readValue16 = readValue(buffer);
            java.util.List<? extends java.lang.Object> list16 = readValue16 instanceof java.util.List ? (java.util.List) readValue16 : null;
            if (list16 != null) {
                return com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage.INSTANCE.fromList(list16);
            }
            return null;
        }
        if (type != -112) {
            return super.readValueOfType(type, buffer);
        }
        java.lang.Object readValue17 = readValue(buffer);
        java.util.List<? extends java.lang.Object> list17 = readValue17 instanceof java.util.List ? (java.util.List) readValue17 : null;
        if (list17 != null) {
            return com.tencent.pigeon.liteapp.WxaLiteAppWidgetUnsubscribeStoreMessage.INSTANCE.fromList(list17);
        }
        return null;
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(java.io.ByteArrayOutputStream stream, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(stream, "stream");
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage) {
            stream.write(128);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetCheckAndGetLiteAppPathMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage) {
            stream.write(129);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage) {
            stream.write(130);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetCreateStoreWithPkgPathMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage) {
            stream.write(131);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetDestroyMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage) {
            stream.write(132);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetDispatchStoreMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage) {
            stream.write(133);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidAndSessionIdMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidMessage) {
            stream.write(134);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetGenLiteAppUuidMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage) {
            stream.write(135);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishEventToTopPageMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventMessage) {
            stream.write(136);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllByAppIdMessage) {
            stream.write(137);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllByAppIdMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllMessage) {
            stream.write(138);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToAllMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToTopPageMessage) {
            stream.write(139);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetPublishGlobalEventToTopPageMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage) {
            stream.write(140);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetReleaseStoreMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetShowViewMessage) {
            stream.write(141);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetShowViewMessage) obj).toList());
            return;
        }
        if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetStoreIsAliveMessage) {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetStoreIsAliveMessage) obj).toList());
        } else if (obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage) {
            stream.write(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetSubscribeStoreMessage) obj).toList());
        } else if (!(obj instanceof com.tencent.pigeon.liteapp.WxaLiteAppWidgetUnsubscribeStoreMessage)) {
            super.writeValue(stream, obj);
        } else {
            stream.write(144);
            writeValue(stream, ((com.tencent.pigeon.liteapp.WxaLiteAppWidgetUnsubscribeStoreMessage) obj).toList());
        }
    }
}
